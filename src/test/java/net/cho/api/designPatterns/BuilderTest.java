package net.cho.api.designPatterns;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BuilderTest {
    @Data
    @AllArgsConstructor
    class Mobile {
        private final int ram;
        private final int storage;
        private final int battery;
        private final int camera;
        private final String processor;
        private final double screenSize;

        public Mobile(MobileBuilder builder) {
            this.ram = builder.ram;
            this.storage = builder.storage;
            this.battery = builder.battery;
            this.camera = builder.camera;
            this.processor = builder.processor;
            this.screenSize = builder.screenSize;
        }
    }

    @Data class MobileBuilder {
        private int ram; /* if final, Default Constructor Error */
        private int storage;
        private int battery;
        private int camera;
        private String processor;
        private double screenSize;
        public MobileBuilder with(Consumer<MobileBuilder> buildFields) {
            buildFields.accept(this);
            return this;
        }

        public Mobile createMobile() {
            return new Mobile(this);
        }
        //객체를 만드는 팩토리 builder Item.java에 Builder 어노테이션을 사용했다. 실전에서 사용할때는 그냥 찍음


    }
    @Test @DisplayName("Builder 패턴")
    void main()
    {
        MobileBuilder builder = new MobileBuilder();
        Mobile myMobile = builder.with(myBuilder -> {
            myBuilder.ram = 4;
            myBuilder.battery=4000;
            myBuilder.processor="A12";

        }).createMobile();
        assertThat(myMobile.getRam(),is(4));
        assertThat(myMobile.getBattery(),is(4000));
        assertThat(myMobile.getProcessor(),is(equalTo("A12")));

    }

}
