package cn.nextop.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@EnableBatchProcessing
public class SampleBatch {
	@Autowired
	private JobBuilderFactory jobs;

	@Autowired
	private StepBuilderFactory steps;

	@Bean
	protected Tasklet tasklet() {

		return new Tasklet() {
			@Override
			public RepeatStatus execute(StepContribution contribution,
					ChunkContext context) {
				return RepeatStatus.FINISHED;
			}
		};

	}

	@Bean
	public Job job() throws Exception {
		return this.jobs.get("job").start(step1()).build();
	}

	@Bean
	protected Step step1() throws Exception {
		return this.steps.get("step1").tasklet(tasklet()).build();
	}
}
