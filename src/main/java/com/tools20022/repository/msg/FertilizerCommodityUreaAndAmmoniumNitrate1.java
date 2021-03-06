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
import com.tools20022.repository.codeset.AssetClassProductType5Code;
import com.tools20022.repository.codeset.AssetClassSubProductType44Code;
import com.tools20022.repository.entity.Commodity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines commodity sub-product attributes of a fertilizer derivative of type
 * urea and ammonium nitrate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1#mmBaseProduct
 * FertilizerCommodityUreaAndAmmoniumNitrate1.mmBaseProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1#mmSubProduct
 * FertilizerCommodityUreaAndAmmoniumNitrate1.mmSubProduct}</li>
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
 * "FertilizerCommodityUreaAndAmmoniumNitrate1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity sub-product attributes of a fertilizer derivative of type urea and ammonium nitrate."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FertilizerCommodityUreaAndAmmoniumNitrate1", propOrder = {"baseProduct", "subProduct"})
public class FertilizerCommodityUreaAndAmmoniumNitrate1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BasePdct", required = true)
	protected AssetClassProductType5Code baseProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductType5Code
	 * AssetClassProductType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmBaseProduct
	 * Commodity.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1
	 * FertilizerCommodityUreaAndAmmoniumNitrate1}</li>
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
	public static final MMMessageAttribute<FertilizerCommodityUreaAndAmmoniumNitrate1, AssetClassProductType5Code> mmBaseProduct = new MMMessageAttribute<FertilizerCommodityUreaAndAmmoniumNitrate1, AssetClassProductType5Code>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmBaseProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1.mmObject();
			isDerived = false;
			xmlTag = "BasePdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseProduct";
			definition = "Base product for the underlying asset class as specified in the classification of commodities derivatives table.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassProductType5Code.mmObject();
		}

		@Override
		public AssetClassProductType5Code getValue(FertilizerCommodityUreaAndAmmoniumNitrate1 obj) {
			return obj.getBaseProduct();
		}

		@Override
		public void setValue(FertilizerCommodityUreaAndAmmoniumNitrate1 obj, AssetClassProductType5Code value) {
			obj.setBaseProduct(value);
		}
	};
	@XmlElement(name = "SubPdct", required = true)
	protected AssetClassSubProductType44Code subProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType44Code
	 * AssetClassSubProductType44Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1
	 * FertilizerCommodityUreaAndAmmoniumNitrate1}</li>
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
	public static final MMMessageAttribute<FertilizerCommodityUreaAndAmmoniumNitrate1, AssetClassSubProductType44Code> mmSubProduct = new MMMessageAttribute<FertilizerCommodityUreaAndAmmoniumNitrate1, AssetClassSubProductType44Code>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1.mmObject();
			isDerived = false;
			xmlTag = "SubPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubProduct";
			definition = "Sub-product for the underlying asset class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AssetClassSubProductType44Code.mmObject();
		}

		@Override
		public AssetClassSubProductType44Code getValue(FertilizerCommodityUreaAndAmmoniumNitrate1 obj) {
			return obj.getSubProduct();
		}

		@Override
		public void setValue(FertilizerCommodityUreaAndAmmoniumNitrate1 obj, AssetClassSubProductType44Code value) {
			obj.setSubProduct(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1.mmBaseProduct, com.tools20022.repository.msg.FertilizerCommodityUreaAndAmmoniumNitrate1.mmSubProduct);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FertilizerCommodityUreaAndAmmoniumNitrate1";
				definition = "Defines commodity sub-product attributes of a fertilizer derivative of type urea and ammonium nitrate.";
			}
		});
		return mmObject_lazy.get();
	}

	public AssetClassProductType5Code getBaseProduct() {
		return baseProduct;
	}

	public FertilizerCommodityUreaAndAmmoniumNitrate1 setBaseProduct(AssetClassProductType5Code baseProduct) {
		this.baseProduct = Objects.requireNonNull(baseProduct);
		return this;
	}

	public AssetClassSubProductType44Code getSubProduct() {
		return subProduct;
	}

	public FertilizerCommodityUreaAndAmmoniumNitrate1 setSubProduct(AssetClassSubProductType44Code subProduct) {
		this.subProduct = Objects.requireNonNull(subProduct);
		return this;
	}
}