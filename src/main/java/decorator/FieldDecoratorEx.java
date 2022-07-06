package decorator;

import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;
 public  class FieldDecoratorEx extends DefaultFieldDecorator {
    public FieldDecoratorEx(ElementLocatorFactory factory) {
        super(factory);
    }

    @Override
    public Object decorate(ClassLoader loader, Field field) {
        if
        (field.getType().equals(Button.class)) {
            ElementLocator locator = factory.createLocator(field);
            if (locator == null) return null;
                return new Button(proxyForLocator(loader, locator)) {
            };
        }
        return super.decorate(loader, field);
    }
}
