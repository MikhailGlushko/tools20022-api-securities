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
import com.tools20022.repository.area.seev.CorporateActionNotificationV08;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmDateDetails
 * CorporateAction41.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmPeriodDetails
 * CorporateAction41.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmRateAndAmountDetails
 * CorporateAction41.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmPriceDetails
 * CorporateAction41.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmSecuritiesQuantity
 * CorporateAction41.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmInterestAccruedNumberOfDays
 * CorporateAction41.mmInterestAccruedNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmCouponNumber
 * CorporateAction41.mmCouponNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmCertificationBreakdownIndicator
 * CorporateAction41.mmCertificationBreakdownIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmChargesAppliedIndicator
 * CorporateAction41.mmChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmRestrictionIndicator
 * CorporateAction41.mmRestrictionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmAccruedInterestIndicator
 * CorporateAction41.mmAccruedInterestIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmLetterOfGuaranteedDeliveryIndicator
 * CorporateAction41.mmLetterOfGuaranteedDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmDividendType
 * CorporateAction41.mmDividendType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmConversionType
 * CorporateAction41.mmConversionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmOccurrenceType
 * CorporateAction41.mmOccurrenceType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction41#mmOfferType
 * CorporateAction41.mmOfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmRenounceableEntitlementStatusType
 * CorporateAction41.mmRenounceableEntitlementStatusType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction41#mmEventStage
 * CorporateAction41.mmEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmAdditionalBusinessProcessIndicator
 * CorporateAction41.mmAdditionalBusinessProcessIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction41#mmChangeType
 * CorporateAction41.mmChangeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmIntermediateSecuritiesDistributionType
 * CorporateAction41.mmIntermediateSecuritiesDistributionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmCapitalGainInOutIndicator
 * CorporateAction41.mmCapitalGainInOutIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmTaxableIncomePerShareCalculated
 * CorporateAction41.mmTaxableIncomePerShareCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmElectionType
 * CorporateAction41.mmElectionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmLotteryType
 * CorporateAction41.mmLotteryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmCertificationType
 * CorporateAction41.mmCertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmConsentType
 * CorporateAction41.mmConsentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmInformationType
 * CorporateAction41.mmInformationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmTaxOnNonDistributedProceedsIndicator
 * CorporateAction41.mmTaxOnNonDistributedProceedsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmNewPlaceOfIncorporation
 * CorporateAction41.mmNewPlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction41#mmAdditionalInformation
 * CorporateAction41.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmCorporateActionDetails
 * CorporateActionNotificationV08.mmCorporateActionDetails}</li>
 * </ul>
 * </li>
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
 * "CorporateAction41"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action event."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateAction41", propOrder = {"dateDetails", "periodDetails", "rateAndAmountDetails", "priceDetails", "securitiesQuantity", "interestAccruedNumberOfDays", "couponNumber", "certificationBreakdownIndicator",
		"chargesAppliedIndicator", "restrictionIndicator", "accruedInterestIndicator", "letterOfGuaranteedDeliveryIndicator", "dividendType", "conversionType", "occurrenceType", "offerType", "renounceableEntitlementStatusType",
		"eventStage", "additionalBusinessProcessIndicator", "changeType", "intermediateSecuritiesDistributionType", "capitalGainInOutIndicator", "taxableIncomePerShareCalculated", "electionType", "lotteryType", "certificationType",
		"consentType", "informationType", "taxOnNonDistributedProceedsIndicator", "newPlaceOfIncorporation", "additionalInformation"})
public class CorporateAction41 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtDtls")
	protected CorporateActionDate61 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate61
	 * CorporateActionDate61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the dates related to a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<CorporateActionDate61>> mmDateDetails = new MMMessageAssociationEnd<CorporateAction41, Optional<CorporateActionDate61>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionDate61.mmObject();
		}

		@Override
		public Optional<CorporateActionDate61> getValue(CorporateAction41 obj) {
			return obj.getDateDetails();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<CorporateActionDate61> value) {
			obj.setDateDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PrdDtls")
	protected CorporateActionPeriod14 periodDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14
	 * CorporateActionPeriod14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrdDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the periods related to a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<CorporateActionPeriod14>> mmPeriodDetails = new MMMessageAssociationEnd<CorporateAction41, Optional<CorporateActionPeriod14>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "PrdDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPeriod14.mmObject();
		}

		@Override
		public Optional<CorporateActionPeriod14> getValue(CorporateAction41 obj) {
			return obj.getPeriodDetails();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<CorporateActionPeriod14> value) {
			obj.setPeriodDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RateAndAmtDtls")
	protected CorporateActionRate91 rateAndAmountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate91
	 * CorporateActionRate91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateAndAmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndAmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about rates and amounts related to a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<CorporateActionRate91>> mmRateAndAmountDetails = new MMMessageAssociationEnd<CorporateAction41, Optional<CorporateActionRate91>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionRate91.mmObject();
		}

		@Override
		public Optional<CorporateActionRate91> getValue(CorporateAction41 obj) {
			return obj.getRateAndAmountDetails();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<CorporateActionRate91> value) {
			obj.setRateAndAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected CorporateActionPrice57 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice57
	 * CorporateActionPrice57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the prices related to a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<CorporateActionPrice57>> mmPriceDetails = new MMMessageAssociationEnd<CorporateAction41, Optional<CorporateActionPrice57>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPrice57.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice57> getValue(CorporateAction41 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<CorporateActionPrice57> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesQty")
	protected CorporateActionQuantity7 securitiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7
	 * CorporateActionQuantity7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantity
	 * CorporateActionEvent.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about securities quantity linked to a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<CorporateActionQuantity7>> mmSecuritiesQuantity = new MMMessageAssociationEnd<CorporateAction41, Optional<CorporateActionQuantity7>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "SctiesQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity linked to a corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionQuantity7.mmObject();
		}

		@Override
		public Optional<CorporateActionQuantity7> getValue(CorporateAction41 obj) {
			return obj.getSecuritiesQuantity();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<CorporateActionQuantity7> value) {
			obj.setSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstAcrdNbOfDays")
	protected Max3Number interestAccruedNumberOfDays;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstAcrdNbOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99A::DAAC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAccruedNumberOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of days used for calculating the accrued interest amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction41, Optional<Max3Number>> mmInterestAccruedNumberOfDays = new MMMessageAttribute<CorporateAction41, Optional<Max3Number>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "IntrstAcrdNbOfDays";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99A::DAAC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAccruedNumberOfDays";
			definition = "Number of days used for calculating the accrued interest amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}

		@Override
		public Optional<Max3Number> getValue(CorporateAction41 obj) {
			return obj.getInterestAccruedNumberOfDays();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<Max3Number> value) {
			obj.setInterestAccruedNumberOfDays(value.orElse(null));
		}
	};
	@XmlElement(name = "CpnNb")
	protected List<IdentificationFormat3Choice> couponNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationFormat3Choice
	 * IdentificationFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmNumber
	 * CouponAttached.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::COUP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of the coupon attached/associated with a security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, List<IdentificationFormat3Choice>> mmCouponNumber = new MMMessageAssociationEnd<CorporateAction41, List<IdentificationFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "CpnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::COUP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponNumber";
			definition = "Number of the coupon attached/associated with a security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IdentificationFormat3Choice.mmObject();
		}

		@Override
		public List<IdentificationFormat3Choice> getValue(CorporateAction41 obj) {
			return obj.getCouponNumber();
		}

		@Override
		public void setValue(CorporateAction41 obj, List<IdentificationFormat3Choice> value) {
			obj.setCouponNumber(value);
		}
	};
	@XmlElement(name = "CertfctnBrkdwnInd")
	protected YesNoIndicator certificationBreakdownIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationIndicator
	 * BeneficialOwner.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnBrkdwnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CEFI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationBreakdownIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether certification/breakdown is required. \r\nYes = certification required.\r\nNo = no certification required."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction41, Optional<YesNoIndicator>> mmCertificationBreakdownIndicator = new MMMessageAttribute<CorporateAction41, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "CertfctnBrkdwnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CEFI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationBreakdownIndicator";
			definition = "Indicates whether certification/breakdown is required. \r\nYes = certification required.\r\nNo = no certification required.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction41 obj) {
			return obj.getCertificationBreakdownIndicator();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<YesNoIndicator> value) {
			obj.setCertificationBreakdownIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgsApldInd")
	protected YesNoIndicator chargesAppliedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChargesAppliedIndicator
	 * CorporateActionOption.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsApldInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::RCHG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAppliedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether charges apply to the holder, for instance redemption charges."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction41, Optional<YesNoIndicator>> mmChargesAppliedIndicator = new MMMessageAttribute<CorporateAction41, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChargesAppliedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "ChrgsApldInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::RCHG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether charges apply to the holder, for instance redemption charges.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction41 obj) {
			return obj.getChargesAppliedIndicator();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<YesNoIndicator> value) {
			obj.setChargesAppliedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "RstrctnInd")
	protected YesNoIndicator restrictionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRestrictionIndicator
	 * CorporateActionEvent.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::COMP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is restrictions apply to the corporate action event or not.\nYes = There is restrictions.\nNo = There is no restrictions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction41, Optional<YesNoIndicator>> mmRestrictionIndicator = new MMMessageAttribute<CorporateAction41, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmRestrictionIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "RstrctnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::COMP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionIndicator";
			definition = "Indicates whether there is restrictions apply to the corporate action event or not.\nYes = There is restrictions.\nNo = There is no restrictions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction41 obj) {
			return obj.getRestrictionIndicator();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<YesNoIndicator> value) {
			obj.setRestrictionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstInd")
	protected YesNoIndicator accruedInterestIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterestIndicator
	 * SecuritiesSettlement.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::ACRU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the holder is entitled to accrued interest."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction41, Optional<YesNoIndicator>> mmAccruedInterestIndicator = new MMMessageAttribute<CorporateAction41, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmAccruedInterestIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::ACRU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestIndicator";
			definition = "Indicates whether the holder is entitled to accrued interest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction41 obj) {
			return obj.getAccruedInterestIndicator();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<YesNoIndicator> value) {
			obj.setAccruedInterestIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "LttrOfGrntedDlvryInd")
	protected YesNoIndicator letterOfGuaranteedDeliveryIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrOfGrntedDlvryInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuaranteedDeliveryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a letter of guaranteed delivery can be submitted in order to participate in the offer on full eligible position. It is not intended for use in situations arising from failed or late trades."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction41, Optional<YesNoIndicator>> mmLetterOfGuaranteedDeliveryIndicator = new MMMessageAttribute<CorporateAction41, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "LttrOfGrntedDlvryInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuaranteedDeliveryIndicator";
			definition = "Indicates whether a letter of guaranteed delivery can be submitted in order to participate in the offer on full eligible position. It is not intended for use in situations arising from failed or late trades.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction41 obj) {
			return obj.getLetterOfGuaranteedDeliveryIndicator();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<YesNoIndicator> value) {
			obj.setLetterOfGuaranteedDeliveryIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "DvddTp")
	protected DividendTypeFormat9Choice dividendType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat9Choice
	 * DividendTypeFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDividend
	 * Security.mmDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DIVI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conditions in which a dividend is paid."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<DividendTypeFormat9Choice>> mmDividendType = new MMMessageAssociationEnd<CorporateAction41, Optional<DividendTypeFormat9Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "DvddTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DIVI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendType";
			definition = "Specifies the conditions in which a dividend is paid.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DividendTypeFormat9Choice.mmObject();
		}

		@Override
		public Optional<DividendTypeFormat9Choice> getValue(CorporateAction41 obj) {
			return obj.getDividendType();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<DividendTypeFormat9Choice> value) {
			obj.setDividendType(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvsTp")
	protected ConversionTypeFormat3Choice conversionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat3Choice
	 * ConversionTypeFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionType
	 * SecuritiesConversion.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CONV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conversion type of an instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<ConversionTypeFormat3Choice>> mmConversionType = new MMMessageAssociationEnd<CorporateAction41, Optional<ConversionTypeFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "ConvsTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CONV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionType";
			definition = "Specifies the conversion type of an instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ConversionTypeFormat3Choice.mmObject();
		}

		@Override
		public Optional<ConversionTypeFormat3Choice> getValue(CorporateAction41 obj) {
			return obj.getConversionType();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<ConversionTypeFormat3Choice> value) {
			obj.setConversionType(value.orElse(null));
		}
	};
	@XmlElement(name = "OcrncTp")
	protected DistributionTypeFormat7Choice occurrenceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat7Choice
	 * DistributionTypeFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionDistribution
	 * CorporateActionServicing.mmCorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OcrncTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DITY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OccurrenceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions in which the instructions and/or payment of the proceeds occurs."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<DistributionTypeFormat7Choice>> mmOccurrenceType = new MMMessageAssociationEnd<CorporateAction41, Optional<DistributionTypeFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionServicing.mmCorporateActionDistribution;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "OcrncTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DITY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OccurrenceType";
			definition = "Specifies the conditions in which the instructions and/or payment of the proceeds occurs.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DistributionTypeFormat7Choice.mmObject();
		}

		@Override
		public Optional<DistributionTypeFormat7Choice> getValue(CorporateAction41 obj) {
			return obj.getOccurrenceType();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<DistributionTypeFormat7Choice> value) {
			obj.setOccurrenceType(value.orElse(null));
		}
	};
	@XmlElement(name = "OfferTp")
	protected List<OfferTypeFormat10Choice> offerType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat10Choice
	 * OfferTypeFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOfferType
	 * CorporateActionOption.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OfferTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::OFFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conditions that apply to the offer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, List<OfferTypeFormat10Choice>> mmOfferType = new MMMessageAssociationEnd<CorporateAction41, List<OfferTypeFormat10Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOfferType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "OfferTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::OFFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferType";
			definition = "Specifies the conditions that apply to the offer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OfferTypeFormat10Choice.mmObject();
		}

		@Override
		public List<OfferTypeFormat10Choice> getValue(CorporateAction41 obj) {
			return obj.getOfferType();
		}

		@Override
		public void setValue(CorporateAction41 obj, List<OfferTypeFormat10Choice> value) {
			obj.setOfferType(value);
		}
	};
	@XmlElement(name = "RnncblEntitlmntStsTp")
	protected RenounceableEntitlementStatusTypeFormat3Choice renounceableEntitlementStatusType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat3Choice
	 * RenounceableEntitlementStatusTypeFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmRenounceableEntitlementStatusType
	 * CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RnncblEntitlmntStsTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SELL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenounceableEntitlementStatusType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether terms of the event allow resale of the rights."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<RenounceableEntitlementStatusTypeFormat3Choice>> mmRenounceableEntitlementStatusType = new MMMessageAssociationEnd<CorporateAction41, Optional<RenounceableEntitlementStatusTypeFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "RnncblEntitlmntStsTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenounceableEntitlementStatusType";
			definition = "Specifies whether terms of the event allow resale of the rights.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RenounceableEntitlementStatusTypeFormat3Choice.mmObject();
		}

		@Override
		public Optional<RenounceableEntitlementStatusTypeFormat3Choice> getValue(CorporateAction41 obj) {
			return obj.getRenounceableEntitlementStatusType();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<RenounceableEntitlementStatusTypeFormat3Choice> value) {
			obj.setRenounceableEntitlementStatusType(value.orElse(null));
		}
	};
	@XmlElement(name = "EvtStag")
	protected List<CorporateActionEventStageFormat13Choice> eventStage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat13Choice
	 * CorporateActionEventStageFormat13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventStage
	 * CorporateActionEvent.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtStag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ESTA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, List<CorporateActionEventStageFormat13Choice>> mmEventStage = new MMMessageAssociationEnd<CorporateAction41, List<CorporateActionEventStageFormat13Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventStage;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "EvtStag";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ESTA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionEventStageFormat13Choice.mmObject();
		}

		@Override
		public List<CorporateActionEventStageFormat13Choice> getValue(CorporateAction41 obj) {
			return obj.getEventStage();
		}

		@Override
		public void setValue(CorporateAction41 obj, List<CorporateActionEventStageFormat13Choice> value) {
			obj.setEventStage(value);
		}
	};
	@XmlElement(name = "AddtlBizPrcInd")
	protected List<AdditionalBusinessProcessFormat9Choice> additionalBusinessProcessIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat9Choice
	 * AdditionalBusinessProcessFormat9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAdditionalBusinessProcess
	 * CorporateActionEvent.mmAdditionalBusinessProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBizPrcInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ADDB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBusinessProcessIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, List<AdditionalBusinessProcessFormat9Choice>> mmAdditionalBusinessProcessIndicator = new MMMessageAssociationEnd<CorporateAction41, List<AdditionalBusinessProcessFormat9Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAdditionalBusinessProcess;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "AddtlBizPrcInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ADDB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBusinessProcessIndicator";
			definition = "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalBusinessProcessFormat9Choice.mmObject();
		}

		@Override
		public List<AdditionalBusinessProcessFormat9Choice> getValue(CorporateAction41 obj) {
			return obj.getAdditionalBusinessProcessIndicator();
		}

		@Override
		public void setValue(CorporateAction41 obj, List<AdditionalBusinessProcessFormat9Choice> value) {
			obj.setAdditionalBusinessProcessIndicator(value);
		}
	};
	@XmlElement(name = "ChngTp")
	protected List<CorporateActionChangeTypeFormat5Choice> changeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat5Choice
	 * CorporateActionChangeTypeFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmChangeType
	 * SecuritiesModification.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChngTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CHAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of change announced."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, List<CorporateActionChangeTypeFormat5Choice>> mmChangeType = new MMMessageAssociationEnd<CorporateAction41, List<CorporateActionChangeTypeFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesModification.mmChangeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "ChngTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CHAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeType";
			definition = "Specifies the type of change announced.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionChangeTypeFormat5Choice.mmObject();
		}

		@Override
		public List<CorporateActionChangeTypeFormat5Choice> getValue(CorporateAction41 obj) {
			return obj.getChangeType();
		}

		@Override
		public void setValue(CorporateAction41 obj, List<CorporateActionChangeTypeFormat5Choice> value) {
			obj.setChangeType(value);
		}
	};
	@XmlElement(name = "IntrmdtSctiesDstrbtnTp")
	protected IntermediateSecuritiesDistributionTypeFormat15Choice intermediateSecuritiesDistributionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat15Choice
	 * IntermediateSecuritiesDistributionTypeFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesDistributionType
	 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmdtSctiesDstrbtnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::RHDI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistributionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of intermediates securities distribution."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<IntermediateSecuritiesDistributionTypeFormat15Choice>> mmIntermediateSecuritiesDistributionType = new MMMessageAssociationEnd<CorporateAction41, Optional<IntermediateSecuritiesDistributionTypeFormat15Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "IntrmdtSctiesDstrbtnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::RHDI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistributionType";
			definition = "Type of intermediates securities distribution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IntermediateSecuritiesDistributionTypeFormat15Choice.mmObject();
		}

		@Override
		public Optional<IntermediateSecuritiesDistributionTypeFormat15Choice> getValue(CorporateAction41 obj) {
			return obj.getIntermediateSecuritiesDistributionType();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<IntermediateSecuritiesDistributionTypeFormat15Choice> value) {
			obj.setIntermediateSecuritiesDistributionType(value.orElse(null));
		}
	};
	@XmlElement(name = "CptlGnInOutInd")
	protected CapitalGainFormat3Choice capitalGainInOutIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat3Choice
	 * CapitalGainFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUCapitalGain
	 * SecuritiesTax.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CptlGnInOutInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ECIO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainInOutIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the capital gain is in the scope of the EU Savings directive for the income realised upon the sale, refund or redemption of shares and units (.) (Article 6(1d))."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<CapitalGainFormat3Choice>> mmCapitalGainInOutIndicator = new MMMessageAssociationEnd<CorporateAction41, Optional<CapitalGainFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUCapitalGain;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "CptlGnInOutInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ECIO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainInOutIndicator";
			definition = "Specifies whether the capital gain is in the scope of the EU Savings directive for the income realised upon the sale, refund or redemption of shares and units (.) (Article 6(1d)).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CapitalGainFormat3Choice.mmObject();
		}

		@Override
		public Optional<CapitalGainFormat3Choice> getValue(CorporateAction41 obj) {
			return obj.getCapitalGainInOutIndicator();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<CapitalGainFormat3Choice> value) {
			obj.setCapitalGainInOutIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxblIncmPerShrClctd")
	protected TaxableIncomePerShareCalculatedFormat3Choice taxableIncomePerShareCalculated;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat3Choice
	 * TaxableIncomePerShareCalculatedFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShareCalculated
	 * SecuritiesTax.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerShrClctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TDTA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShareCalculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the financial instrument calculates the taxable income per dividend/taxable income per share."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<TaxableIncomePerShareCalculatedFormat3Choice>> mmTaxableIncomePerShareCalculated = new MMMessageAssociationEnd<CorporateAction41, Optional<TaxableIncomePerShareCalculatedFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShareCalculated;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShrClctd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TDTA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the financial instrument calculates the taxable income per dividend/taxable income per share.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxableIncomePerShareCalculatedFormat3Choice.mmObject();
		}

		@Override
		public Optional<TaxableIncomePerShareCalculatedFormat3Choice> getValue(CorporateAction41 obj) {
			return obj.getTaxableIncomePerShareCalculated();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<TaxableIncomePerShareCalculatedFormat3Choice> value) {
			obj.setTaxableIncomePerShareCalculated(value.orElse(null));
		}
	};
	@XmlElement(name = "ElctnTp")
	protected ElectionTypeFormat3Choice electionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat3Choice
	 * ElectionTypeFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmElectionType
	 * CorporateActionElection.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ELCT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the effect on the holdings of electing a corporate action option."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<ElectionTypeFormat3Choice>> mmElectionType = new MMMessageAssociationEnd<CorporateAction41, Optional<ElectionTypeFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionElection.mmElectionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "ElctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ELCT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionType";
			definition = "Specifies the effect on the holdings of electing a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ElectionTypeFormat3Choice.mmObject();
		}

		@Override
		public Optional<ElectionTypeFormat3Choice> getValue(CorporateAction41 obj) {
			return obj.getElectionType();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<ElectionTypeFormat3Choice> value) {
			obj.setElectionType(value.orElse(null));
		}
	};
	@XmlElement(name = "LtryTp")
	protected LotteryTypeFormat4Choice lotteryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat4Choice
	 * LotteryTypeFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmLotteryType
	 * Lottery.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LOTO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of lottery announced."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<LotteryTypeFormat4Choice>> mmLotteryType = new MMMessageAssociationEnd<CorporateAction41, Optional<LotteryTypeFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> Lottery.mmLotteryType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "LtryTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LOTO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LotteryTypeFormat4Choice.mmObject();
		}

		@Override
		public Optional<LotteryTypeFormat4Choice> getValue(CorporateAction41 obj) {
			return obj.getLotteryType();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<LotteryTypeFormat4Choice> value) {
			obj.setLotteryType(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnTp")
	protected CertificationTypeFormat3Choice certificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat3Choice
	 * CertificationTypeFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CETI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the certification format required, this is, physical or electronic format."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<CertificationTypeFormat3Choice>> mmCertificationType = new MMMessageAssociationEnd<CorporateAction41, Optional<CertificationTypeFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "CertfctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CETI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationType";
			definition = "Specifies the certification format required, this is, physical or electronic format.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CertificationTypeFormat3Choice.mmObject();
		}

		@Override
		public Optional<CertificationTypeFormat3Choice> getValue(CorporateAction41 obj) {
			return obj.getCertificationType();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<CertificationTypeFormat3Choice> value) {
			obj.setCertificationType(value.orElse(null));
		}
	};
	@XmlElement(name = "CnsntTp")
	protected ConsentTypeFormat4Choice consentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ConsentTypeFormat4Choice
	 * ConsentTypeFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmConsentType
	 * CorporateActionEvent.mmConsentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnsntTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of consent announced."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<ConsentTypeFormat4Choice>> mmConsentType = new MMMessageAssociationEnd<CorporateAction41, Optional<ConsentTypeFormat4Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmConsentType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "CnsntTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentType";
			definition = "Specifies the type of consent announced.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ConsentTypeFormat4Choice.mmObject();
		}

		@Override
		public Optional<ConsentTypeFormat4Choice> getValue(CorporateAction41 obj) {
			return obj.getConsentType();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<ConsentTypeFormat4Choice> value) {
			obj.setConsentType(value.orElse(null));
		}
	};
	@XmlElement(name = "InfTp")
	protected InformationTypeFormat4Choice informationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InformationTypeFormat4Choice
	 * InformationTypeFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of information event."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<InformationTypeFormat4Choice>> mmInformationType = new MMMessageAssociationEnd<CorporateAction41, Optional<InformationTypeFormat4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "InfTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationType";
			definition = "Specifies the type of information event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InformationTypeFormat4Choice.mmObject();
		}

		@Override
		public Optional<InformationTypeFormat4Choice> getValue(CorporateAction41 obj) {
			return obj.getInformationType();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<InformationTypeFormat4Choice> value) {
			obj.setInformationType(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxOnNonDstrbtdPrcdsInd")
	protected GenericIdentification30 taxOnNonDistributedProceedsIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTaxOnNonDistributedProceedsIndicator
	 * CorporateActionEvent.mmTaxOnNonDistributedProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxOnNonDstrbtdPrcdsInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnNonDistributedProceedsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the tax regulation being attributed to the non-distributed proceeds event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<GenericIdentification30>> mmTaxOnNonDistributedProceedsIndicator = new MMMessageAssociationEnd<CorporateAction41, Optional<GenericIdentification30>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmTaxOnNonDistributedProceedsIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "TaxOnNonDstrbtdPrcdsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnNonDistributedProceedsIndicator";
			definition = "Specifies the tax regulation being attributed to the non-distributed proceeds event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification30.mmObject();
		}

		@Override
		public Optional<GenericIdentification30> getValue(CorporateAction41 obj) {
			return obj.getTaxOnNonDistributedProceedsIndicator();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<GenericIdentification30> value) {
			obj.setTaxOnNonDistributedProceedsIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NewPlcOfIncorprtn")
	protected Max350Text newPlaceOfIncorporation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewOrganisationInformation
	 * SecuritiesModification.mmNewOrganisationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewPlcOfIncorprtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94G::NPLI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPlaceOfIncorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New company's place of incorporation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction41, Optional<Max350Text>> mmNewPlaceOfIncorporation = new MMMessageAttribute<CorporateAction41, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesModification.mmNewOrganisationInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "NewPlcOfIncorprtn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94G::NPLI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPlaceOfIncorporation";
			definition = "New company's place of incorporation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(CorporateAction41 obj) {
			return obj.getNewPlaceOfIncorporation();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<Max350Text> value) {
			obj.setNewPlaceOfIncorporation(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative26 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative26
	 * CorporateActionNarrative26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction41
	 * CorporateAction41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information. This field may only be used when the information to be transmitted, cannot be coded."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction41, Optional<CorporateActionNarrative26>> mmAdditionalInformation = new MMMessageAssociationEnd<CorporateAction41, Optional<CorporateActionNarrative26>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction41.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information. This field may only be used when the information to be transmitted, cannot be coded.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionNarrative26.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative26> getValue(CorporateAction41 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateAction41 obj, Optional<CorporateActionNarrative26> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction41.mmDateDetails, com.tools20022.repository.msg.CorporateAction41.mmPeriodDetails,
						com.tools20022.repository.msg.CorporateAction41.mmRateAndAmountDetails, com.tools20022.repository.msg.CorporateAction41.mmPriceDetails, com.tools20022.repository.msg.CorporateAction41.mmSecuritiesQuantity,
						com.tools20022.repository.msg.CorporateAction41.mmInterestAccruedNumberOfDays, com.tools20022.repository.msg.CorporateAction41.mmCouponNumber,
						com.tools20022.repository.msg.CorporateAction41.mmCertificationBreakdownIndicator, com.tools20022.repository.msg.CorporateAction41.mmChargesAppliedIndicator,
						com.tools20022.repository.msg.CorporateAction41.mmRestrictionIndicator, com.tools20022.repository.msg.CorporateAction41.mmAccruedInterestIndicator,
						com.tools20022.repository.msg.CorporateAction41.mmLetterOfGuaranteedDeliveryIndicator, com.tools20022.repository.msg.CorporateAction41.mmDividendType,
						com.tools20022.repository.msg.CorporateAction41.mmConversionType, com.tools20022.repository.msg.CorporateAction41.mmOccurrenceType, com.tools20022.repository.msg.CorporateAction41.mmOfferType,
						com.tools20022.repository.msg.CorporateAction41.mmRenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction41.mmEventStage,
						com.tools20022.repository.msg.CorporateAction41.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction41.mmChangeType,
						com.tools20022.repository.msg.CorporateAction41.mmIntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateAction41.mmCapitalGainInOutIndicator,
						com.tools20022.repository.msg.CorporateAction41.mmTaxableIncomePerShareCalculated, com.tools20022.repository.msg.CorporateAction41.mmElectionType, com.tools20022.repository.msg.CorporateAction41.mmLotteryType,
						com.tools20022.repository.msg.CorporateAction41.mmCertificationType, com.tools20022.repository.msg.CorporateAction41.mmConsentType, com.tools20022.repository.msg.CorporateAction41.mmInformationType,
						com.tools20022.repository.msg.CorporateAction41.mmTaxOnNonDistributedProceedsIndicator, com.tools20022.repository.msg.CorporateAction41.mmNewPlaceOfIncorporation,
						com.tools20022.repository.msg.CorporateAction41.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmCorporateActionDetails);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateAction41";
				definition = "Provides information about the corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CorporateActionDate61> getDateDetails() {
		return dateDetails == null ? Optional.empty() : Optional.of(dateDetails);
	}

	public CorporateAction41 setDateDetails(CorporateActionDate61 dateDetails) {
		this.dateDetails = dateDetails;
		return this;
	}

	public Optional<CorporateActionPeriod14> getPeriodDetails() {
		return periodDetails == null ? Optional.empty() : Optional.of(periodDetails);
	}

	public CorporateAction41 setPeriodDetails(CorporateActionPeriod14 periodDetails) {
		this.periodDetails = periodDetails;
		return this;
	}

	public Optional<CorporateActionRate91> getRateAndAmountDetails() {
		return rateAndAmountDetails == null ? Optional.empty() : Optional.of(rateAndAmountDetails);
	}

	public CorporateAction41 setRateAndAmountDetails(CorporateActionRate91 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
		return this;
	}

	public Optional<CorporateActionPrice57> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public CorporateAction41 setPriceDetails(CorporateActionPrice57 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}

	public Optional<CorporateActionQuantity7> getSecuritiesQuantity() {
		return securitiesQuantity == null ? Optional.empty() : Optional.of(securitiesQuantity);
	}

	public CorporateAction41 setSecuritiesQuantity(CorporateActionQuantity7 securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
		return this;
	}

	public Optional<Max3Number> getInterestAccruedNumberOfDays() {
		return interestAccruedNumberOfDays == null ? Optional.empty() : Optional.of(interestAccruedNumberOfDays);
	}

	public CorporateAction41 setInterestAccruedNumberOfDays(Max3Number interestAccruedNumberOfDays) {
		this.interestAccruedNumberOfDays = interestAccruedNumberOfDays;
		return this;
	}

	public List<IdentificationFormat3Choice> getCouponNumber() {
		return couponNumber == null ? couponNumber = new ArrayList<>() : couponNumber;
	}

	public CorporateAction41 setCouponNumber(List<IdentificationFormat3Choice> couponNumber) {
		this.couponNumber = Objects.requireNonNull(couponNumber);
		return this;
	}

	public Optional<YesNoIndicator> getCertificationBreakdownIndicator() {
		return certificationBreakdownIndicator == null ? Optional.empty() : Optional.of(certificationBreakdownIndicator);
	}

	public CorporateAction41 setCertificationBreakdownIndicator(YesNoIndicator certificationBreakdownIndicator) {
		this.certificationBreakdownIndicator = certificationBreakdownIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getChargesAppliedIndicator() {
		return chargesAppliedIndicator == null ? Optional.empty() : Optional.of(chargesAppliedIndicator);
	}

	public CorporateAction41 setChargesAppliedIndicator(YesNoIndicator chargesAppliedIndicator) {
		this.chargesAppliedIndicator = chargesAppliedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getRestrictionIndicator() {
		return restrictionIndicator == null ? Optional.empty() : Optional.of(restrictionIndicator);
	}

	public CorporateAction41 setRestrictionIndicator(YesNoIndicator restrictionIndicator) {
		this.restrictionIndicator = restrictionIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getAccruedInterestIndicator() {
		return accruedInterestIndicator == null ? Optional.empty() : Optional.of(accruedInterestIndicator);
	}

	public CorporateAction41 setAccruedInterestIndicator(YesNoIndicator accruedInterestIndicator) {
		this.accruedInterestIndicator = accruedInterestIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getLetterOfGuaranteedDeliveryIndicator() {
		return letterOfGuaranteedDeliveryIndicator == null ? Optional.empty() : Optional.of(letterOfGuaranteedDeliveryIndicator);
	}

	public CorporateAction41 setLetterOfGuaranteedDeliveryIndicator(YesNoIndicator letterOfGuaranteedDeliveryIndicator) {
		this.letterOfGuaranteedDeliveryIndicator = letterOfGuaranteedDeliveryIndicator;
		return this;
	}

	public Optional<DividendTypeFormat9Choice> getDividendType() {
		return dividendType == null ? Optional.empty() : Optional.of(dividendType);
	}

	public CorporateAction41 setDividendType(DividendTypeFormat9Choice dividendType) {
		this.dividendType = dividendType;
		return this;
	}

	public Optional<ConversionTypeFormat3Choice> getConversionType() {
		return conversionType == null ? Optional.empty() : Optional.of(conversionType);
	}

	public CorporateAction41 setConversionType(ConversionTypeFormat3Choice conversionType) {
		this.conversionType = conversionType;
		return this;
	}

	public Optional<DistributionTypeFormat7Choice> getOccurrenceType() {
		return occurrenceType == null ? Optional.empty() : Optional.of(occurrenceType);
	}

	public CorporateAction41 setOccurrenceType(DistributionTypeFormat7Choice occurrenceType) {
		this.occurrenceType = occurrenceType;
		return this;
	}

	public List<OfferTypeFormat10Choice> getOfferType() {
		return offerType == null ? offerType = new ArrayList<>() : offerType;
	}

	public CorporateAction41 setOfferType(List<OfferTypeFormat10Choice> offerType) {
		this.offerType = Objects.requireNonNull(offerType);
		return this;
	}

	public Optional<RenounceableEntitlementStatusTypeFormat3Choice> getRenounceableEntitlementStatusType() {
		return renounceableEntitlementStatusType == null ? Optional.empty() : Optional.of(renounceableEntitlementStatusType);
	}

	public CorporateAction41 setRenounceableEntitlementStatusType(RenounceableEntitlementStatusTypeFormat3Choice renounceableEntitlementStatusType) {
		this.renounceableEntitlementStatusType = renounceableEntitlementStatusType;
		return this;
	}

	public List<CorporateActionEventStageFormat13Choice> getEventStage() {
		return eventStage == null ? eventStage = new ArrayList<>() : eventStage;
	}

	public CorporateAction41 setEventStage(List<CorporateActionEventStageFormat13Choice> eventStage) {
		this.eventStage = Objects.requireNonNull(eventStage);
		return this;
	}

	public List<AdditionalBusinessProcessFormat9Choice> getAdditionalBusinessProcessIndicator() {
		return additionalBusinessProcessIndicator == null ? additionalBusinessProcessIndicator = new ArrayList<>() : additionalBusinessProcessIndicator;
	}

	public CorporateAction41 setAdditionalBusinessProcessIndicator(List<AdditionalBusinessProcessFormat9Choice> additionalBusinessProcessIndicator) {
		this.additionalBusinessProcessIndicator = Objects.requireNonNull(additionalBusinessProcessIndicator);
		return this;
	}

	public List<CorporateActionChangeTypeFormat5Choice> getChangeType() {
		return changeType == null ? changeType = new ArrayList<>() : changeType;
	}

	public CorporateAction41 setChangeType(List<CorporateActionChangeTypeFormat5Choice> changeType) {
		this.changeType = Objects.requireNonNull(changeType);
		return this;
	}

	public Optional<IntermediateSecuritiesDistributionTypeFormat15Choice> getIntermediateSecuritiesDistributionType() {
		return intermediateSecuritiesDistributionType == null ? Optional.empty() : Optional.of(intermediateSecuritiesDistributionType);
	}

	public CorporateAction41 setIntermediateSecuritiesDistributionType(IntermediateSecuritiesDistributionTypeFormat15Choice intermediateSecuritiesDistributionType) {
		this.intermediateSecuritiesDistributionType = intermediateSecuritiesDistributionType;
		return this;
	}

	public Optional<CapitalGainFormat3Choice> getCapitalGainInOutIndicator() {
		return capitalGainInOutIndicator == null ? Optional.empty() : Optional.of(capitalGainInOutIndicator);
	}

	public CorporateAction41 setCapitalGainInOutIndicator(CapitalGainFormat3Choice capitalGainInOutIndicator) {
		this.capitalGainInOutIndicator = capitalGainInOutIndicator;
		return this;
	}

	public Optional<TaxableIncomePerShareCalculatedFormat3Choice> getTaxableIncomePerShareCalculated() {
		return taxableIncomePerShareCalculated == null ? Optional.empty() : Optional.of(taxableIncomePerShareCalculated);
	}

	public CorporateAction41 setTaxableIncomePerShareCalculated(TaxableIncomePerShareCalculatedFormat3Choice taxableIncomePerShareCalculated) {
		this.taxableIncomePerShareCalculated = taxableIncomePerShareCalculated;
		return this;
	}

	public Optional<ElectionTypeFormat3Choice> getElectionType() {
		return electionType == null ? Optional.empty() : Optional.of(electionType);
	}

	public CorporateAction41 setElectionType(ElectionTypeFormat3Choice electionType) {
		this.electionType = electionType;
		return this;
	}

	public Optional<LotteryTypeFormat4Choice> getLotteryType() {
		return lotteryType == null ? Optional.empty() : Optional.of(lotteryType);
	}

	public CorporateAction41 setLotteryType(LotteryTypeFormat4Choice lotteryType) {
		this.lotteryType = lotteryType;
		return this;
	}

	public Optional<CertificationTypeFormat3Choice> getCertificationType() {
		return certificationType == null ? Optional.empty() : Optional.of(certificationType);
	}

	public CorporateAction41 setCertificationType(CertificationTypeFormat3Choice certificationType) {
		this.certificationType = certificationType;
		return this;
	}

	public Optional<ConsentTypeFormat4Choice> getConsentType() {
		return consentType == null ? Optional.empty() : Optional.of(consentType);
	}

	public CorporateAction41 setConsentType(ConsentTypeFormat4Choice consentType) {
		this.consentType = consentType;
		return this;
	}

	public Optional<InformationTypeFormat4Choice> getInformationType() {
		return informationType == null ? Optional.empty() : Optional.of(informationType);
	}

	public CorporateAction41 setInformationType(InformationTypeFormat4Choice informationType) {
		this.informationType = informationType;
		return this;
	}

	public Optional<GenericIdentification30> getTaxOnNonDistributedProceedsIndicator() {
		return taxOnNonDistributedProceedsIndicator == null ? Optional.empty() : Optional.of(taxOnNonDistributedProceedsIndicator);
	}

	public CorporateAction41 setTaxOnNonDistributedProceedsIndicator(GenericIdentification30 taxOnNonDistributedProceedsIndicator) {
		this.taxOnNonDistributedProceedsIndicator = taxOnNonDistributedProceedsIndicator;
		return this;
	}

	public Optional<Max350Text> getNewPlaceOfIncorporation() {
		return newPlaceOfIncorporation == null ? Optional.empty() : Optional.of(newPlaceOfIncorporation);
	}

	public CorporateAction41 setNewPlaceOfIncorporation(Max350Text newPlaceOfIncorporation) {
		this.newPlaceOfIncorporation = newPlaceOfIncorporation;
		return this;
	}

	public Optional<CorporateActionNarrative26> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateAction41 setAdditionalInformation(CorporateActionNarrative26 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}