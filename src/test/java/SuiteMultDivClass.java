import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(MultDivCategory.class)
@Suite.SuiteClasses({TestMult.class,TestDiv.class})

public class SuiteMultDivClass {

}
