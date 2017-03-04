package br.com.home.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.home.test.categoria1.TesteServico1;
import br.com.home.test.categoria1.TesteServico4;
import br.com.home.test.categoria2.TesteServico2;
import br.com.home.test.categoria2.TesteServico3;

@RunWith(Suite.class)
@SuiteClasses({ TesteServico1.class, TesteServico2.class, TesteServico3.class, TesteServico4.class })
public class AllTests {

}
