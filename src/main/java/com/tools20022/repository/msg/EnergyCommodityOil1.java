/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AssetClassDetailedSubProductType7Code;
import com.tools20022.repository.codeset.AssetClassProductType2Code;
import com.tools20022.repository.codeset.AssetClassSubProductType8Code;
import com.tools20022.repository.entity.Commodity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines commodity sub-product attributes of an energy derivative of type oil.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergyCommodityOil1#mmBaseProduct
 * EnergyCommodityOil1.mmBaseProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergyCommodityOil1#mmSubProduct
 * EnergyCommodityOil1.mmSubProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergyCommodityOil1#mmAdditionalSubProduct
 * EnergyCommodityOil1.mmAdditionalSubProduct}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Commodity Commodity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EnergyCommodityOil1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity sub-product attributes of an energy derivative of type oil."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EnergyCommodityOil1", propOrder = {"baseProduct", "subProduct", "additionalSubProduct"})
public class EnergyCommodityOil1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BasePdct", required = true)
	protected AssetClassProductType2Code baseProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductType2Code
	 * AssetClassProductType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityOil1
	 * EnergyCommodityOil1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BasePdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Base product for the underlying asset class as specified in the classification of commodities derivatives table."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnergyCommodityOil1, AssetClassProductType2Code> mmBaseProduct = new MMMessageAttribute<EnergyCommodityOil1, AssetClassProductType2Code>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.EnergyCommodityOil1.mmObject();
			isDerived = false;
			xmlTag = "BasePdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseProduct";
			definition = "Base product for the underlying asset class as specified in the classification of commodities derivatives table.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassProductType2Code.mmObject();
		}

		@Override
		public AssetClassProductType2Code getValue(EnergyCommodityOil1 obj) {
			return obj.getBaseProduct();
		}

		@Override
		public void setValue(EnergyCommodityOil1 obj, AssetClassProductType2Code value) {
			obj.setBaseProduct(value);
		}
	};
	@XmlElement(name = "SubPdct", required = true)
	protected AssetClassSubProductType8Code subProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType8Code
	 * AssetClassSubProductType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityOil1
	 * EnergyCommodityOil1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sub-product for the underlying asset class."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnergyCommodityOil1, AssetClassSubProductType8Code> mmSubProduct = new MMMessageAttribute<EnergyCommodityOil1, AssetClassSubProductType8Code>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.EnergyCommodityOil1.mmObject();
			isDerived = false;
			xmlTag = "SubPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubProduct";
			definition = "Sub-product for the underlying asset class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassSubProductType8Code.mmObject();
		}

		@Override
		public AssetClassSubProductType8Code getValue(EnergyCommodityOil1 obj) {
			return obj.getSubProduct();
		}

		@Override
		public void setValue(EnergyCommodityOil1 obj, AssetClassSubProductType8Code value) {
			obj.setSubProduct(value);
		}
	};
	@XmlElement(name = "AddtlSubPdct")
	protected AssetClassDetailedSubProductType7Code additionalSubProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType7Code
	 * AssetClassDetailedSubProductType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnergyCommodityOil1
	 * EnergyCommodityOil1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlSubPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalSubProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further subproduct type related to instruments that have a non-financial instrument or commodity as underlying."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnergyCommodityOil1, Optional<AssetClassDetailedSubProductType7Code>> mmAdditionalSubProduct = new MMMessageAttribute<EnergyCommodityOil1, Optional<AssetClassDetailedSubProductType7Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnergyCommodityOil1.mmObject();
			isDerived = false;
			xmlTag = "AddtlSubPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalSubProduct";
			definition = "Further subproduct type related to instruments that have a non-financial instrument or commodity as underlying.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClassDetailedSubProductType7Code.mmObject();
		}

		@Override
		public Optional<AssetClassDetailedSubProductType7Code> getValue(EnergyCommodityOil1 obj) {
			return obj.getAdditionalSubProduct();
		}

		@Override
		public void setValue(EnergyCommodityOil1 obj, Optional<AssetClassDetailedSubProductType7Code> value) {
			obj.setAdditionalSubProduct(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EnergyCommodityOil1.mmBaseProduct, com.tools20022.repository.msg.EnergyCommodityOil1.mmSubProduct,
						com.tools20022.repository.msg.EnergyCommodityOil1.mmAdditionalSubProduct);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EnergyCommodityOil1";
				definition = "Defines commodity sub-product attributes of an energy derivative of type oil.";
			}
		});
		return mmObject_lazy.get();
	}

	public AssetClassProductType2Code getBaseProduct() {
		return baseProduct;
	}

	public EnergyCommodityOil1 setBaseProduct(AssetClassProductType2Code baseProduct) {
		this.baseProduct = Objects.requireNonNull(baseProduct);
		return this;
	}

	public AssetClassSubProductType8Code getSubProduct() {
		return subProduct;
	}

	public EnergyCommodityOil1 setSubProduct(AssetClassSubProductType8Code subProduct) {
		this.subProduct = Objects.requireNonNull(subProduct);
		return this;
	}

	public Optional<AssetClassDetailedSubProductType7Code> getAdditionalSubProduct() {
		return additionalSubProduct == null ? Optional.empty() : Optional.of(additionalSubProduct);
	}

	public EnergyCommodityOil1 setAdditionalSubProduct(AssetClassDetailedSubProductType7Code additionalSubProduct) {
		this.additionalSubProduct = additionalSubProduct;
		return this;
	}
}