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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.TypeOfPrice29Choice;
import com.tools20022.repository.entity.LotBreakdown;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Balance7;
import com.tools20022.repository.msg.GenericIdentification37;
import com.tools20022.repository.msg.Price2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of breakdown of a quantity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#mmLotNumber
 * QuantityBreakdown27.mmLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#mmLotQuantity
 * QuantityBreakdown27.mmLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#mmLotDateTime
 * QuantityBreakdown27.mmLotDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityBreakdown27#mmLotPrice
 * QuantityBreakdown27.mmLotPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#mmTypeOfPrice
 * QuantityBreakdown27.mmTypeOfPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.LotBreakdown
 * LotBreakdown}</li>
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
 * "QuantityBreakdown27"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of breakdown of a quantity."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "QuantityBreakdown27", propOrder = {"lotNumber", "lotQuantity", "lotDateTime", "lotPrice", "typeOfPrice"})
public class QuantityBreakdown27 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LotNb")
	protected GenericIdentification37 lotNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification37
	 * GenericIdentification37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
	 * LotBreakdown.mmLotNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27
	 * QuantityBreakdown27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::LOTS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuantityBreakdown27, Optional<GenericIdentification37>> mmLotNumber = new MMMessageAttribute<QuantityBreakdown27, Optional<GenericIdentification37>>() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmLotNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityBreakdown27.mmObject();
			isDerived = false;
			xmlTag = "LotNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::LOTS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotNumber";
			definition = "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification37.mmObject();
		}

		@Override
		public Optional<GenericIdentification37> getValue(QuantityBreakdown27 obj) {
			return obj.getLotNumber();
		}

		@Override
		public void setValue(QuantityBreakdown27 obj, Optional<GenericIdentification37> value) {
			obj.setLotNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "LotQty")
	protected Balance7 lotQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Balance7 Balance7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmSecuritiesQuantity
	 * LotBreakdown.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27
	 * QuantityBreakdown27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::LOTS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instruments that is part of the lot described."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityBreakdown27, Optional<Balance7>> mmLotQuantity = new MMMessageAssociationEnd<QuantityBreakdown27, Optional<Balance7>>() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityBreakdown27.mmObject();
			isDerived = false;
			xmlTag = "LotQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::LOTS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotQuantity";
			definition = "Quantity of financial instruments that is part of the lot described.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Balance7.mmObject();
		}

		@Override
		public Optional<Balance7> getValue(QuantityBreakdown27 obj) {
			return obj.getLotQuantity();
		}

		@Override
		public void setValue(QuantityBreakdown27 obj, Optional<Balance7> value) {
			obj.setLotQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "LotDtTm")
	protected DateAndDateTimeChoice lotDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotDateTime
	 * LotBreakdown.mmLotDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27
	 * QuantityBreakdown27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::LOTS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the lot was purchased."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuantityBreakdown27, Optional<DateAndDateTimeChoice>> mmLotDateTime = new MMMessageAttribute<QuantityBreakdown27, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmLotDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityBreakdown27.mmObject();
			isDerived = false;
			xmlTag = "LotDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::LOTS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotDateTime";
			definition = "Date/time at which the lot was purchased.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(QuantityBreakdown27 obj) {
			return obj.getLotDateTime();
		}

		@Override
		public void setValue(QuantityBreakdown27 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setLotDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "LotPric")
	protected Price2 lotPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price2 Price2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotPrice
	 * LotBreakdown.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27
	 * QuantityBreakdown27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LotPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::LOTS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price at which the lot was purchased."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityBreakdown27, Optional<Price2>> mmLotPrice = new MMMessageAssociationEnd<QuantityBreakdown27, Optional<Price2>>() {
		{
			businessElementTrace_lazy = () -> LotBreakdown.mmLotPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityBreakdown27.mmObject();
			isDerived = false;
			xmlTag = "LotPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::LOTS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotPrice";
			definition = "Price at which the lot was purchased.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price2.mmObject();
		}

		@Override
		public Optional<Price2> getValue(QuantityBreakdown27 obj) {
			return obj.getLotPrice();
		}

		@Override
		public void setValue(QuantityBreakdown27 obj, Optional<Price2> value) {
			obj.setLotPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "TpOfPric")
	protected TypeOfPrice29Choice typeOfPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice29Choice
	 * TypeOfPrice29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27
	 * QuantityBreakdown27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of price and information about the price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuantityBreakdown27, Optional<TypeOfPrice29Choice>> mmTypeOfPrice = new MMMessageAttribute<QuantityBreakdown27, Optional<TypeOfPrice29Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityBreakdown27.mmObject();
			isDerived = false;
			xmlTag = "TpOfPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfPrice";
			definition = "Specifies the type of price and information about the price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TypeOfPrice29Choice.mmObject();
		}

		@Override
		public Optional<TypeOfPrice29Choice> getValue(QuantityBreakdown27 obj) {
			return obj.getTypeOfPrice();
		}

		@Override
		public void setValue(QuantityBreakdown27 obj, Optional<TypeOfPrice29Choice> value) {
			obj.setTypeOfPrice(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuantityBreakdown27.mmLotNumber, com.tools20022.repository.msg.QuantityBreakdown27.mmLotQuantity,
						com.tools20022.repository.msg.QuantityBreakdown27.mmLotDateTime, com.tools20022.repository.msg.QuantityBreakdown27.mmLotPrice, com.tools20022.repository.msg.QuantityBreakdown27.mmTypeOfPrice);
				trace_lazy = () -> LotBreakdown.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuantityBreakdown27";
				definition = "Details of breakdown of a quantity.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<GenericIdentification37> getLotNumber() {
		return lotNumber == null ? Optional.empty() : Optional.of(lotNumber);
	}

	public QuantityBreakdown27 setLotNumber(GenericIdentification37 lotNumber) {
		this.lotNumber = lotNumber;
		return this;
	}

	public Optional<Balance7> getLotQuantity() {
		return lotQuantity == null ? Optional.empty() : Optional.of(lotQuantity);
	}

	public QuantityBreakdown27 setLotQuantity(Balance7 lotQuantity) {
		this.lotQuantity = lotQuantity;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getLotDateTime() {
		return lotDateTime == null ? Optional.empty() : Optional.of(lotDateTime);
	}

	public QuantityBreakdown27 setLotDateTime(DateAndDateTimeChoice lotDateTime) {
		this.lotDateTime = lotDateTime;
		return this;
	}

	public Optional<Price2> getLotPrice() {
		return lotPrice == null ? Optional.empty() : Optional.of(lotPrice);
	}

	public QuantityBreakdown27 setLotPrice(Price2 lotPrice) {
		this.lotPrice = lotPrice;
		return this;
	}

	public Optional<TypeOfPrice29Choice> getTypeOfPrice() {
		return typeOfPrice == null ? Optional.empty() : Optional.of(typeOfPrice);
	}

	public QuantityBreakdown27 setTypeOfPrice(TypeOfPrice29Choice typeOfPrice) {
		this.typeOfPrice = typeOfPrice;
		return this;
	}
}