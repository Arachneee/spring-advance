package hello.advanced.trace.strategy;

import org.junit.jupiter.api.Test;

import hello.advanced.trace.strategy.code.strategy.ContextV1;
import hello.advanced.trace.strategy.code.strategy.ContextV2;
import hello.advanced.trace.strategy.code.strategy.Strategy;
import hello.advanced.trace.strategy.code.strategy.StrategyLogic1;
import hello.advanced.trace.strategy.code.strategy.StrategyLogic2;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContextV2Test {
	@Test
	void strategyV1() {
		ContextV2 context = new ContextV2();
		context.execute(new StrategyLogic1());
		context.execute(new StrategyLogic2());
	}

	@Test
	void strategyV2() {
		ContextV2 context = new ContextV2();
		context.execute(() -> log.info("비지니스 로직1 실행"));
		context.execute(() -> log.info("비지니스 로직2 실행"));
	}

}
