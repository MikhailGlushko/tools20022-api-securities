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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.IndicativeOrMarketPrice8Choice;
import com.tools20022.repository.choice.PriceFormat48Choice;
import com.tools20022.repository.choice.PriceFormat50Choice;
import com.tools20022.repository.choice.PriceFormat51Choice;
import com.tools20022.repository.entity.CorporateActionPrice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountPrice2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies prices.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmCashInLieuOfSharePrice
 * CorporateActionPrice59.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmIndicativeOrMarketPrice
 * CorporateActionPrice59.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmCashValueForTax
 * CorporateActionPrice59.mmCashValueForTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmGenericCashPricePaidPerProduct
 * CorporateActionPrice59.mmGenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmGenericCashPriceReceivedPerProduct
 * CorporateActionPrice59.mmGenericCashPriceReceivedPerProduct}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionPrice
 * CorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice59
 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice59}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPrice59"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPrice59", propOrder = {"cashInLieuOfSharePrice", "indicativeOrMarketPrice", "cashValueForTax", "genericCashPricePaidPerProduct", "genericCashPriceReceivedPerProduct"})
public class CorporateActionPrice59 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CshInLieuOfShrPric")
	protected PriceFormat50Choice cashInLieuOfSharePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat50Choice
	 * PriceFormat50Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
	 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59
	 * CorporateActionPrice59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInLieuOfShrPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::CINL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of equities; usually in lieu of fractional quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionPrice59, Optional<PriceFormat50Choice>> mmCashInLieuOfSharePrice = new MMMessageAttribute<CorporateActionPrice59, Optional<PriceFormat50Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmCashInLieuOfSharePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice59.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShrPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::CINL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat50Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat50Choice> getValue(CorporateActionPrice59 obj) {
			return obj.getCashInLieuOfSharePrice();
		}

		@Override
		public void setValue(CorporateActionPrice59 obj, Optional<PriceFormat50Choice> value) {
			obj.setCashInLieuOfSharePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "IndctvOrMktPric")
	protected IndicativeOrMarketPrice8Choice indicativeOrMarketPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice8Choice
	 * IndicativeOrMarketPrice8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59
	 * CorporateActionPrice59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndctvOrMktPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::INDC or MRKT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndicativeOrMarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price is an indicative price or a market price."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice59, Optional<IndicativeOrMarketPrice8Choice>> mmIndicativeOrMarketPrice = new MMMessageAssociationEnd<CorporateActionPrice59, Optional<IndicativeOrMarketPrice8Choice>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionPrice.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice59.mmObject();
			isDerived = false;
			xmlTag = "IndctvOrMktPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::INDC or MRKT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndicativeOrMarketPrice";
			definition = "Indicates whether the price is an indicative price or a market price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IndicativeOrMarketPrice8Choice.mmObject();
		}

		@Override
		public Optional<IndicativeOrMarketPrice8Choice> getValue(CorporateActionPrice59 obj) {
			return obj.getIndicativeOrMarketPrice();
		}

		@Override
		public void setValue(CorporateActionPrice59 obj, Optional<IndicativeOrMarketPrice8Choice> value) {
			obj.setIndicativeOrMarketPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "CshValForTax")
	protected AmountPrice2 cashValueForTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AmountPrice2
	 * AmountPrice2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashValueForTax
	 * CorporateActionPrice.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59
	 * CorporateActionPrice59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshValForTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashValueForTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash value of resulting securities proceeds for tax calculation and/or reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionPrice59, Optional<AmountPrice2>> mmCashValueForTax = new MMMessageAttribute<CorporateActionPrice59, Optional<AmountPrice2>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmCashValueForTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice59.mmObject();
			isDerived = false;
			xmlTag = "CshValForTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashValueForTax";
			definition = "Cash value of resulting securities proceeds for tax calculation and/or reporting.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountPrice2.mmObject();
		}

		@Override
		public Optional<AmountPrice2> getValue(CorporateActionPrice59 obj) {
			return obj.getCashValueForTax();
		}

		@Override
		public void setValue(CorporateActionPrice59 obj, Optional<AmountPrice2> value) {
			obj.setCashValueForTax(value.orElse(null));
		}
	};
	@XmlElement(name = "GncCshPricPdPerPdct")
	protected PriceFormat51Choice genericCashPricePaidPerProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat51Choice
	 * PriceFormat51Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59
	 * CorporateActionPrice59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GncCshPricPdPerPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price paid per product by the underlying security holder either as a percentage or an amount or a number of points above an index, for example, reinvestment price, strike price and exercise price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice59, Optional<PriceFormat51Choice>> mmGenericCashPricePaidPerProduct = new MMMessageAssociationEnd<CorporateActionPrice59, Optional<PriceFormat51Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPricePaidPerProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice59.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricPdPerPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Generic cash price paid per product by the underlying security holder either as a percentage or an amount or a number of points above an index, for example, reinvestment price, strike price and exercise price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat51Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat51Choice> getValue(CorporateActionPrice59 obj) {
			return obj.getGenericCashPricePaidPerProduct();
		}

		@Override
		public void setValue(CorporateActionPrice59 obj, Optional<PriceFormat51Choice> value) {
			obj.setGenericCashPricePaidPerProduct(value.orElse(null));
		}
	};
	@XmlElement(name = "GncCshPricRcvdPerPdct")
	protected PriceFormat48Choice genericCashPriceReceivedPerProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat48Choice
	 * PriceFormat48Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59
	 * CorporateActionPrice59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GncCshPricRcvdPerPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price received per product by the underlying security holder either as a percentage or an amount, for example, redemption price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPrice59, Optional<PriceFormat48Choice>> mmGenericCashPriceReceivedPerProduct = new MMMessageAssociationEnd<CorporateActionPrice59, Optional<PriceFormat48Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPriceReceivedPerProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPrice59.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricRcvdPerPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, for example, redemption price.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat48Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat48Choice> getValue(CorporateActionPrice59 obj) {
			return obj.getGenericCashPriceReceivedPerProduct();
		}

		@Override
		public void setValue(CorporateActionPrice59 obj, Optional<PriceFormat48Choice> value) {
			obj.setGenericCashPriceReceivedPerProduct(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice59.mmCashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice59.mmIndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice59.mmCashValueForTax, com.tools20022.repository.msg.CorporateActionPrice59.mmGenericCashPricePaidPerProduct,
						com.tools20022.repository.msg.CorporateActionPrice59.mmGenericCashPriceReceivedPerProduct);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice59);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice59";
				definition = "Specifies prices.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PriceFormat50Choice> getCashInLieuOfSharePrice() {
		return cashInLieuOfSharePrice == null ? Optional.empty() : Optional.of(cashInLieuOfSharePrice);
	}

	public CorporateActionPrice59 setCashInLieuOfSharePrice(PriceFormat50Choice cashInLieuOfSharePrice) {
		this.cashInLieuOfSharePrice = cashInLieuOfSharePrice;
		return this;
	}

	public Optional<IndicativeOrMarketPrice8Choice> getIndicativeOrMarketPrice() {
		return indicativeOrMarketPrice == null ? Optional.empty() : Optional.of(indicativeOrMarketPrice);
	}

	public CorporateActionPrice59 setIndicativeOrMarketPrice(IndicativeOrMarketPrice8Choice indicativeOrMarketPrice) {
		this.indicativeOrMarketPrice = indicativeOrMarketPrice;
		return this;
	}

	public Optional<AmountPrice2> getCashValueForTax() {
		return cashValueForTax == null ? Optional.empty() : Optional.of(cashValueForTax);
	}

	public CorporateActionPrice59 setCashValueForTax(AmountPrice2 cashValueForTax) {
		this.cashValueForTax = cashValueForTax;
		return this;
	}

	public Optional<PriceFormat51Choice> getGenericCashPricePaidPerProduct() {
		return genericCashPricePaidPerProduct == null ? Optional.empty() : Optional.of(genericCashPricePaidPerProduct);
	}

	public CorporateActionPrice59 setGenericCashPricePaidPerProduct(PriceFormat51Choice genericCashPricePaidPerProduct) {
		this.genericCashPricePaidPerProduct = genericCashPricePaidPerProduct;
		return this;
	}

	public Optional<PriceFormat48Choice> getGenericCashPriceReceivedPerProduct() {
		return genericCashPriceReceivedPerProduct == null ? Optional.empty() : Optional.of(genericCashPriceReceivedPerProduct);
	}

	public CorporateActionPrice59 setGenericCashPriceReceivedPerProduct(PriceFormat48Choice genericCashPriceReceivedPerProduct) {
		this.genericCashPriceReceivedPerProduct = genericCashPriceReceivedPerProduct;
		return this;
	}
}