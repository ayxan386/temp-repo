package org.demo.webfile.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.demo.webfile.model.ApplicationAttributeHolder;
import org.demo.webfile.model.Product;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplicationDTO {
  private Product Product;
  private List<ApplicationAttributeHolder> ApplicationAttributes;
}
