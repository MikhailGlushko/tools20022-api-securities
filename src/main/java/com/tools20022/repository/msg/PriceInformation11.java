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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateAndDateTime1Choice;
import com.tools20022.repository.choice.DateTimePeriodChoice;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.SourceOfPrice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MarketIdentification79;
import com.tools20022.repository.msg.Price4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of money for which goods or services are offered, sold, or bought.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation11#mmValue
 * PriceInformation11.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation11#mmQuotationDate
 * PriceInformation11.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation11#mmPriceCalculationPeriod
 * PriceInformation11.mmPriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation11#mmSourceOfPrice
 * PriceInformation11.mmSourceOfPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
 * SecuritiesPricing}</li>
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
 * "PriceInformation11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money for which goods or services are offered, sold, or bought."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PriceInformation11", propOrder = {"value", "quotationDate", "priceCalculationPeriod", "sourceOfPrice"})
public class PriceInformation11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Val", required = true)
	protected Price4 value;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11
	 * PriceInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Val"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the price, for instance, as a currency and value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceInformation11, Price4> mmValue = new MMMessageAttribute<PriceInformation11, Price4>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesPricing.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation11.mmObject();
			isDerived = false;
			xmlTag = "Val";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Value of the price, for instance, as a currency and value.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Price4.mmObject();
		}

		@Override
		public Price4 getValue(PriceInformation11 obj) {
			return obj.getValue();
		}

		@Override
		public void setValue(PriceInformation11 obj, Price4 value) {
			obj.setValue(value);
		}
	};
	@XmlElement(name = "QtnDt")
	protected DateAndDateTime1Choice quotationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime1Choice
	 * DateAndDateTime1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmQuotationDate
	 * SecuritiesPricing.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11
	 * PriceInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::PRIC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the price is obtained. With an investment fund, this is as stated in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceInformation11, Optional<DateAndDateTime1Choice>> mmQuotationDate = new MMMessageAttribute<PriceInformation11, Optional<DateAndDateTime1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmQuotationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation11.mmObject();
			isDerived = false;
			xmlTag = "QtnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::PRIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDate";
			definition = "Date on which the price is obtained. With an investment fund, this is as stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTime1Choice.mmObject();
		}

		@Override
		public Optional<DateAndDateTime1Choice> getValue(PriceInformation11 obj) {
			return obj.getQuotationDate();
		}

		@Override
		public void setValue(PriceInformation11 obj, Optional<DateAndDateTime1Choice> value) {
			obj.setQuotationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PricClctnPrd")
	protected DateTimePeriodChoice priceCalculationPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
	 * DateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceCalculationPeriod
	 * SecuritiesPricing.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11
	 * PriceInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricClctnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCalculationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the price of a security is determined (For outturn securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceInformation11, Optional<DateTimePeriodChoice>> mmPriceCalculationPeriod = new MMMessageAttribute<PriceInformation11, Optional<DateTimePeriodChoice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceCalculationPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation11.mmObject();
			isDerived = false;
			xmlTag = "PricClctnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined (For outturn securities).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}

		@Override
		public Optional<DateTimePeriodChoice> getValue(PriceInformation11 obj) {
			return obj.getPriceCalculationPeriod();
		}

		@Override
		public void setValue(PriceInformation11 obj, Optional<DateTimePeriodChoice> value) {
			obj.setPriceCalculationPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "SrcOfPric")
	protected MarketIdentification79 sourceOfPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification79
	 * MarketIdentification79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#mmMarketIdentification
	 * SourceOfPrice.mmMarketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11
	 * PriceInformation11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcOfPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94B::PRIC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place from which the price was obtained."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceInformation11, Optional<MarketIdentification79>> mmSourceOfPrice = new MMMessageAttribute<PriceInformation11, Optional<MarketIdentification79>>() {
		{
			businessElementTrace_lazy = () -> SourceOfPrice.mmMarketIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation11.mmObject();
			isDerived = false;
			xmlTag = "SrcOfPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94B::PRIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceOfPrice";
			definition = "Place from which the price was obtained.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketIdentification79.mmObject();
		}

		@Override
		public Optional<MarketIdentification79> getValue(PriceInformation11 obj) {
			return obj.getSourceOfPrice();
		}

		@Override
		public void setValue(PriceInformation11 obj, Optional<MarketIdentification79> value) {
			obj.setSourceOfPrice(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PriceInformation11.mmValue, com.tools20022.repository.msg.PriceInformation11.mmQuotationDate,
						com.tools20022.repository.msg.PriceInformation11.mmPriceCalculationPeriod, com.tools20022.repository.msg.PriceInformation11.mmSourceOfPrice);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceInformation11";
				definition = "Amount of money for which goods or services are offered, sold, or bought.";
			}
		});
		return mmObject_lazy.get();
	}

	public Price4 getValue() {
		return value;
	}

	public PriceInformation11 setValue(Price4 value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}

	public Optional<DateAndDateTime1Choice> getQuotationDate() {
		return quotationDate == null ? Optional.empty() : Optional.of(quotationDate);
	}

	public PriceInformation11 setQuotationDate(DateAndDateTime1Choice quotationDate) {
		this.quotationDate = quotationDate;
		return this;
	}

	public Optional<DateTimePeriodChoice> getPriceCalculationPeriod() {
		return priceCalculationPeriod == null ? Optional.empty() : Optional.of(priceCalculationPeriod);
	}

	public PriceInformation11 setPriceCalculationPeriod(DateTimePeriodChoice priceCalculationPeriod) {
		this.priceCalculationPeriod = priceCalculationPeriod;
		return this;
	}

	public Optional<MarketIdentification79> getSourceOfPrice() {
		return sourceOfPrice == null ? Optional.empty() : Optional.of(sourceOfPrice);
	}

	public PriceInformation11 setSourceOfPrice(MarketIdentification79 sourceOfPrice) {
		this.sourceOfPrice = sourceOfPrice;
		return this;
	}
}