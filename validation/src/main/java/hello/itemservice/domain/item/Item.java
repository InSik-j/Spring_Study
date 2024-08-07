package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
//@ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000", message = "총합이 10,000원이 넘어야 합니다.")
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;


//    @NotNull (groups = UpdateCheck.class)// 수정시에만 적용
//    private Long id;
//
//    @NotBlank(groups = {SaveCheck.class, UpdateCheck.class})
//    private String itemName;
//
//    @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
//    @Range(min=1000, max=1000000, groups = {SaveCheck.class, UpdateCheck.class})
//    private Integer price;
//
//    @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
//    @Max(value = 9999, groups = SaveCheck.class) // 등록시에만 적용
//    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
