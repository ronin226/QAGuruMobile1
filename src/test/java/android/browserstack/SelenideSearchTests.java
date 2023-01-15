package android.browserstack;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class SelenideSearchTests extends TestBase {

    @Test
    void successSearchTest() {
        step("Skip", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click();
        });
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Apple ii");
        });
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
        step("Verify content found by title", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(text("Apple II")));
        step("Verify content found by sub title", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_description"))
                        .shouldHave(text("Apple II")));
        step("Go to page", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                        .click());
        step("Check page", () ->
                $(AppiumBy.className("android.widget.TextView"))
                        .shouldHave(text("Apple II")));
    }
}
