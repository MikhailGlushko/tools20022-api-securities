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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification30;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of settlement of a transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmSecuritiesTransactionType
 * SettlementDetails146.mmSecuritiesTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmSettlementTransactionCondition
 * SettlementDetails146.mmSettlementTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmBeneficialOwnership
 * SettlementDetails146.mmBeneficialOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmCCPEligibility
 * SettlementDetails146.mmCCPEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmDeliveryReturnReason
 * SettlementDetails146.mmDeliveryReturnReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmCashClearingSystem
 * SettlementDetails146.mmCashClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmExposureType
 * SettlementDetails146.mmExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmFXStandingInstruction
 * SettlementDetails146.mmFXStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmMarketClientSide
 * SettlementDetails146.mmMarketClientSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmNettingEligibility
 * SettlementDetails146.mmNettingEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmRegistration
 * SettlementDetails146.mmRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmLegalRestrictions
 * SettlementDetails146.mmLegalRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmSettlingCapacity
 * SettlementDetails146.mmSettlingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmTaxCapacity
 * SettlementDetails146.mmTaxCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmStampDutyTaxBasis
 * SettlementDetails146.mmStampDutyTaxBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmTracking
 * SettlementDetails146.mmTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmLetterOfGuarantee
 * SettlementDetails146.mmLetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmReturnLeg
 * SettlementDetails146.mmReturnLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmModificationCancellationAllowed
 * SettlementDetails146.mmModificationCancellationAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmEligibleForCollateral
 * SettlementDetails146.mmEligibleForCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmSecuritiesSubBalanceType
 * SettlementDetails146.mmSecuritiesSubBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmCashSubBalanceType
 * SettlementDetails146.mmCashSubBalanceType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule#forSettlementDetails146
 * ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails146}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCashSettlementSystemUsageRule#forSettlementDetails146
 * ConstraintCashSettlementSystemUsageRule.forSettlementDetails146}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule#forSettlementDetails146
 * ConstraintOpeningClosingUsageRule.forSettlementDetails146}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementDetails146"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of settlement of a transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementDetails146", propOrder = {"securitiesTransactionType", "settlementTransactionCondition", "beneficialOwnership", "cCPEligibility", "deliveryReturnReason", "cashClearingSystem", "exposureType",
		"fXStandingInstruction", "marketClientSide", "nettingEligibility", "registration", "legalRestrictions", "settlingCapacity", "taxCapacity", "stampDutyTaxBasis", "tracking", "letterOfGuarantee", "returnLeg",
		"modificationCancellationAllowed", "eligibleForCollateral", "securitiesSubBalanceType", "cashSubBalanceType"})
public class SettlementDetails146 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesTxTp")
	protected SecuritiesTransactionType37Choice securitiesTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType37Choice
	 * SecuritiesTransactionType37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
	 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of securities transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<SecuritiesTransactionType37Choice>> mmSecuritiesTransactionType = new MMMessageAttribute<SettlementDetails146, Optional<SecuritiesTransactionType37Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Identifies the type of securities transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesTransactionType37Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesTransactionType37Choice> getValue(SettlementDetails146 obj) {
			return obj.getSecuritiesTransactionType();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<SecuritiesTransactionType37Choice> value) {
			obj.setSecuritiesTransactionType(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmTxCond")
	protected List<SettlementTransactionCondition16Choice> settlementTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition16Choice
	 * SettlementTransactionCondition16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
	 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTxCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditions under which the order/trade is to be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, List<SettlementTransactionCondition16Choice>> mmSettlementTransactionCondition = new MMMessageAttribute<SettlementDetails146, List<SettlementTransactionCondition16Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "SttlmTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade is to be settled.";
			minOccurs = 0;
			complexType_lazy = () -> SettlementTransactionCondition16Choice.mmObject();
		}

		@Override
		public List<SettlementTransactionCondition16Choice> getValue(SettlementDetails146 obj) {
			return obj.getSettlementTransactionCondition();
		}

		@Override
		public void setValue(SettlementDetails146 obj, List<SettlementTransactionCondition16Choice> value) {
			obj.setSettlementTransactionCondition(value);
		}
	};
	@XmlElement(name = "BnfclOwnrsh")
	protected BeneficialOwnership4Choice beneficialOwnership;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnership4Choice
	 * BeneficialOwnership4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBeneficialOwnershipIndicator
	 * SecuritiesSettlement.mmBeneficialOwnershipIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnrsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether there is change of beneficial ownership."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<BeneficialOwnership4Choice>> mmBeneficialOwnership = new MMMessageAttribute<SettlementDetails146, Optional<BeneficialOwnership4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmBeneficialOwnershipIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnership";
			definition = "Specifies whether there is change of beneficial ownership.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BeneficialOwnership4Choice.mmObject();
		}

		@Override
		public Optional<BeneficialOwnership4Choice> getValue(SettlementDetails146 obj) {
			return obj.getBeneficialOwnership();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<BeneficialOwnership4Choice> value) {
			obj.setBeneficialOwnership(value.orElse(null));
		}
	};
	@XmlElement(name = "CCPElgblty")
	protected CentralCounterPartyEligibility4Choice cCPEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CentralCounterPartyEligibility4Choice
	 * CentralCounterPartyEligibility4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmCCPEligibility
	 * SecuritiesDeliveryObligation.mmCCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CCPElgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<CentralCounterPartyEligibility4Choice>> mmCCPEligibility = new MMMessageAttribute<SettlementDetails146, Optional<CentralCounterPartyEligibility4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmCCPEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "CCPElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPEligibility";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CentralCounterPartyEligibility4Choice.mmObject();
		}

		@Override
		public Optional<CentralCounterPartyEligibility4Choice> getValue(SettlementDetails146 obj) {
			return obj.getCCPEligibility();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<CentralCounterPartyEligibility4Choice> value) {
			obj.setCCPEligibility(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryRtrRsn")
	protected DeliveryReturn3Choice deliveryReturnReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DeliveryReturn3Choice
	 * DeliveryReturn3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryRtrRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryReturnReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason of a delivery return."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<DeliveryReturn3Choice>> mmDeliveryReturnReason = new MMMessageAttribute<SettlementDetails146, Optional<DeliveryReturn3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "DlvryRtrRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryReturnReason";
			definition = "Specifies the reason of a delivery return.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DeliveryReturn3Choice.mmObject();
		}

		@Override
		public Optional<DeliveryReturn3Choice> getValue(SettlementDetails146 obj) {
			return obj.getDeliveryReturnReason();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<DeliveryReturn3Choice> value) {
			obj.setDeliveryReturnReason(value.orElse(null));
		}
	};
	@XmlElement(name = "CshClrSys")
	protected CashSettlementSystem4Choice cashClearingSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CashSettlementSystem4Choice
	 * CashSettlementSystem4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole#mmSystem
	 * SettlementInstructionSystemRole.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshClrSys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the category of cash clearing system, for example, cheque clearing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<CashSettlementSystem4Choice>> mmCashClearingSystem = new MMMessageAttribute<SettlementDetails146, Optional<CashSettlementSystem4Choice>>() {
		{
			businessElementTrace_lazy = () -> SettlementInstructionSystemRole.mmSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "CshClrSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashClearingSystem";
			definition = "Specifies the category of cash clearing system, for example, cheque clearing.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashSettlementSystem4Choice.mmObject();
		}

		@Override
		public Optional<CashSettlementSystem4Choice> getValue(SettlementDetails146 obj) {
			return obj.getCashClearingSystem();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<CashSettlementSystem4Choice> value) {
			obj.setCashClearingSystem(value.orElse(null));
		}
	};
	@XmlElement(name = "XpsrTp")
	protected ExposureType16Choice exposureType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ExposureType16Choice
	 * ExposureType16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmExposureType
	 * ExposureTerm.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying business area/type of trade causing the collateral movement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<ExposureType16Choice>> mmExposureType = new MMMessageAttribute<SettlementDetails146, Optional<ExposureType16Choice>>() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmExposureType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "XpsrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ExposureType16Choice.mmObject();
		}

		@Override
		public Optional<ExposureType16Choice> getValue(SettlementDetails146 obj) {
			return obj.getExposureType();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<ExposureType16Choice> value) {
			obj.setExposureType(value.orElse(null));
		}
	};
	@XmlElement(name = "FxStgInstr")
	protected FXStandingInstruction4Choice fXStandingInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FXStandingInstruction4Choice
	 * FXStandingInstruction4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmStandingSettlementInstruction
	 * Settlement.mmStandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxStgInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXStandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the forex standing instruction in place should apply."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<FXStandingInstruction4Choice>> mmFXStandingInstruction = new MMMessageAttribute<SettlementDetails146, Optional<FXStandingInstruction4Choice>>() {
		{
			businessElementTrace_lazy = () -> Settlement.mmStandingSettlementInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "FxStgInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXStandingInstruction";
			definition = "Specifies whether the forex standing instruction in place should apply.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FXStandingInstruction4Choice.mmObject();
		}

		@Override
		public Optional<FXStandingInstruction4Choice> getValue(SettlementDetails146 obj) {
			return obj.getFXStandingInstruction();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<FXStandingInstruction4Choice> value) {
			obj.setFXStandingInstruction(value.orElse(null));
		}
	};
	@XmlElement(name = "MktClntSd")
	protected MarketClientSide6Choice marketClientSide;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MarketClientSide6Choice
	 * MarketClientSide6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmMarketClientSide
	 * SecuritiesSettlement.mmMarketClientSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktClntSd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClientSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if an instruction is for a market side or a client side transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<MarketClientSide6Choice>> mmMarketClientSide = new MMMessageAttribute<SettlementDetails146, Optional<MarketClientSide6Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmMarketClientSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "MktClntSd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction is for a market side or a client side transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketClientSide6Choice.mmObject();
		}

		@Override
		public Optional<MarketClientSide6Choice> getValue(SettlementDetails146 obj) {
			return obj.getMarketClientSide();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<MarketClientSide6Choice> value) {
			obj.setMarketClientSide(value.orElse(null));
		}
	};
	@XmlElement(name = "NetgElgblty")
	protected NettingEligibility4Choice nettingEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility4Choice
	 * NettingEligibility4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmNettingEligibility
	 * SecuritiesDeliveryObligation.mmNettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetgElgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettingEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is eligible for netting."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<NettingEligibility4Choice>> mmNettingEligibility = new MMMessageAttribute<SettlementDetails146, Optional<NettingEligibility4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmNettingEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "NetgElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NettingEligibility";
			definition = "Specifies whether the settlement transaction is eligible for netting.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NettingEligibility4Choice.mmObject();
		}

		@Override
		public Optional<NettingEligibility4Choice> getValue(SettlementDetails146 obj) {
			return obj.getNettingEligibility();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<NettingEligibility4Choice> value) {
			obj.setNettingEligibility(value.orElse(null));
		}
	};
	@XmlElement(name = "Regn")
	protected Registration9Choice registration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Registration9Choice
	 * Registration9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistration
	 * Security.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Regn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether registration should occur upon receipt."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<Registration9Choice>> mmRegistration = new MMMessageAttribute<SettlementDetails146, Optional<Registration9Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistration;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "Regn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registration";
			definition = "Specifies whether registration should occur upon receipt.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Registration9Choice.mmObject();
		}

		@Override
		public Optional<Registration9Choice> getValue(SettlementDetails146 obj) {
			return obj.getRegistration();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<Registration9Choice> value) {
			obj.setRegistration(value.orElse(null));
		}
	};
	@XmlElement(name = "LglRstrctns")
	protected Restriction5Choice legalRestrictions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Restriction5Choice
	 * Restriction5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRestriction
	 * Security.mmRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglRstrctns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regulatory restrictions applicable to a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<Restriction5Choice>> mmLegalRestrictions = new MMMessageAttribute<SettlementDetails146, Optional<Restriction5Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRestriction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "LglRstrctns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRestrictions";
			definition = "Regulatory restrictions applicable to a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Restriction5Choice.mmObject();
		}

		@Override
		public Optional<Restriction5Choice> getValue(SettlementDetails146 obj) {
			return obj.getLegalRestrictions();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<Restriction5Choice> value) {
			obj.setLegalRestrictions(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlgCpcty")
	protected SettlingCapacity7Choice settlingCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlingCapacity7Choice
	 * SettlingCapacity7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSettlingCapacity
	 * SecuritiesSettlementPartyRole.mmSettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlgCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of a party in the settlement of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<SettlingCapacity7Choice>> mmSettlingCapacity = new MMMessageAttribute<SettlementDetails146, Optional<SettlingCapacity7Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlementPartyRole.mmSettlingCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "SttlgCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingCapacity";
			definition = "Role of a party in the settlement of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlingCapacity7Choice.mmObject();
		}

		@Override
		public Optional<SettlingCapacity7Choice> getValue(SettlementDetails146 obj) {
			return obj.getSettlingCapacity();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<SettlingCapacity7Choice> value) {
			obj.setSettlingCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxCpcty")
	protected TaxCapacityParty4Choice taxCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty4Choice
	 * TaxCapacityParty4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmTaxCapacity
	 * SecuritiesSettlementPartyRole.mmTaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax role capacity of the instructing party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<TaxCapacityParty4Choice>> mmTaxCapacity = new MMMessageAttribute<SettlementDetails146, Optional<TaxCapacityParty4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlementPartyRole.mmTaxCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "TaxCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCapacity";
			definition = "Tax role capacity of the instructing party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TaxCapacityParty4Choice.mmObject();
		}

		@Override
		public Optional<TaxCapacityParty4Choice> getValue(SettlementDetails146 obj) {
			return obj.getTaxCapacity();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<TaxCapacityParty4Choice> value) {
			obj.setTaxCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "StmpDtyTaxBsis")
	protected GenericIdentification30 stampDutyTaxBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmStampDutyTaxBasis
	 * SecuritiesTax.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDtyTaxBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyTaxBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the stamp duty type or exemption reason applicable to the settlement transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<GenericIdentification30>> mmStampDutyTaxBasis = new MMMessageAttribute<SettlementDetails146, Optional<GenericIdentification30>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmStampDutyTaxBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyTaxBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyTaxBasis";
			definition = "Specifies the stamp duty type or exemption reason applicable to the settlement transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification30.mmObject();
		}

		@Override
		public Optional<GenericIdentification30> getValue(SettlementDetails146 obj) {
			return obj.getStampDutyTaxBasis();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<GenericIdentification30> value) {
			obj.setStampDutyTaxBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "Trckg")
	protected Tracking4Choice tracking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Tracking4Choice
	 * Tracking4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTracking
	 * SecuritiesSettlement.mmTracking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trckg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the loan and/or collateral is tracked."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<Tracking4Choice>> mmTracking = new MMMessageAttribute<SettlementDetails146, Optional<Tracking4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmTracking;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "Trckg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tracking";
			definition = "Specifies whether the loan and/or collateral is tracked.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Tracking4Choice.mmObject();
		}

		@Override
		public Optional<Tracking4Choice> getValue(SettlementDetails146 obj) {
			return obj.getTracking();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<Tracking4Choice> value) {
			obj.setTracking(value.orElse(null));
		}
	};
	@XmlElement(name = "LttrOfGrnt")
	protected LetterOfGuarantee4Choice letterOfGuarantee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LetterOfGuarantee4Choice
	 * LetterOfGuarantee4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmLetterOfGuarantee
	 * SecuritiesSettlement.mmLetterOfGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrOfGrnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<LetterOfGuarantee4Choice>> mmLetterOfGuarantee = new MMMessageAttribute<SettlementDetails146, Optional<LetterOfGuarantee4Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmLetterOfGuarantee;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "LttrOfGrnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LetterOfGuarantee4Choice.mmObject();
		}

		@Override
		public Optional<LetterOfGuarantee4Choice> getValue(SettlementDetails146 obj) {
			return obj.getLetterOfGuarantee();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<LetterOfGuarantee4Choice> value) {
			obj.setLetterOfGuarantee(value.orElse(null));
		}
	};
	@XmlElement(name = "RtrLeg")
	protected YesNoIndicator returnLeg;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmReturnLegInstruction
	 * SecuritiesFinancing.mmReturnLegInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<YesNoIndicator>> mmReturnLeg = new MMMessageAttribute<SettlementDetails146, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmReturnLegInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "RtrLeg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnLeg";
			definition = "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SettlementDetails146 obj) {
			return obj.getReturnLeg();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<YesNoIndicator> value) {
			obj.setReturnLeg(value.orElse(null));
		}
	};
	@XmlElement(name = "ModCxlAllwd")
	protected ModificationCancellationAllowed4Choice modificationCancellationAllowed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ModificationCancellationAllowed4Choice
	 * ModificationCancellationAllowed4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModCxlAllwd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationCancellationAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a third party is allowed to modify or cancel the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<ModificationCancellationAllowed4Choice>> mmModificationCancellationAllowed = new MMMessageAttribute<SettlementDetails146, Optional<ModificationCancellationAllowed4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "ModCxlAllwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationCancellationAllowed";
			definition = "Specifies whether a third party is allowed to modify or cancel the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ModificationCancellationAllowed4Choice.mmObject();
		}

		@Override
		public Optional<ModificationCancellationAllowed4Choice> getValue(SettlementDetails146 obj) {
			return obj.getModificationCancellationAllowed();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<ModificationCancellationAllowed4Choice> value) {
			obj.setModificationCancellationAllowed(value.orElse(null));
		}
	};
	@XmlElement(name = "ElgblForColl")
	protected YesNoIndicator eligibleForCollateral;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmEligibleForCollateral
	 * SecuritiesSettlement.mmEligibleForCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgblForColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether securities should be included in the pool of securities eligible for collateral purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<YesNoIndicator>> mmEligibleForCollateral = new MMMessageAttribute<SettlementDetails146, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmEligibleForCollateral;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "ElgblForColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateral";
			definition = "Specifies whether securities should be included in the pool of securities eligible for collateral purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SettlementDetails146 obj) {
			return obj.getEligibleForCollateral();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<YesNoIndicator> value) {
			obj.setEligibleForCollateral(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesSubBalTp")
	protected GenericIdentification30 securitiesSubBalanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSubBalTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSubBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities sub balance type indicator (example restriction type for a market infrastructure)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<GenericIdentification30>> mmSecuritiesSubBalanceType = new MMMessageAttribute<SettlementDetails146, Optional<GenericIdentification30>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "SctiesSubBalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSubBalanceType";
			definition = "Specifies the securities sub balance type indicator (example restriction type for a market infrastructure).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification30.mmObject();
		}

		@Override
		public Optional<GenericIdentification30> getValue(SettlementDetails146 obj) {
			return obj.getSecuritiesSubBalanceType();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<GenericIdentification30> value) {
			obj.setSecuritiesSubBalanceType(value.orElse(null));
		}
	};
	@XmlElement(name = "CshSubBalTp")
	protected GenericIdentification30 cashSubBalanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmType
	 * Balance.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146
	 * SettlementDetails146}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSubBalTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSubBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash sub balance type indicator (example restriction type for a market infrastructure)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementDetails146, Optional<GenericIdentification30>> mmCashSubBalanceType = new MMMessageAttribute<SettlementDetails146, Optional<GenericIdentification30>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementDetails146.mmObject();
			isDerived = false;
			xmlTag = "CshSubBalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSubBalanceType";
			definition = "Specifies the cash sub balance type indicator (example restriction type for a market infrastructure).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification30.mmObject();
		}

		@Override
		public Optional<GenericIdentification30> getValue(SettlementDetails146 obj) {
			return obj.getCashSubBalanceType();
		}

		@Override
		public void setValue(SettlementDetails146 obj, Optional<GenericIdentification30> value) {
			obj.setCashSubBalanceType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails146.mmSecuritiesTransactionType, com.tools20022.repository.msg.SettlementDetails146.mmSettlementTransactionCondition,
						com.tools20022.repository.msg.SettlementDetails146.mmBeneficialOwnership, com.tools20022.repository.msg.SettlementDetails146.mmCCPEligibility,
						com.tools20022.repository.msg.SettlementDetails146.mmDeliveryReturnReason, com.tools20022.repository.msg.SettlementDetails146.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails146.mmExposureType,
						com.tools20022.repository.msg.SettlementDetails146.mmFXStandingInstruction, com.tools20022.repository.msg.SettlementDetails146.mmMarketClientSide,
						com.tools20022.repository.msg.SettlementDetails146.mmNettingEligibility, com.tools20022.repository.msg.SettlementDetails146.mmRegistration, com.tools20022.repository.msg.SettlementDetails146.mmLegalRestrictions,
						com.tools20022.repository.msg.SettlementDetails146.mmSettlingCapacity, com.tools20022.repository.msg.SettlementDetails146.mmTaxCapacity, com.tools20022.repository.msg.SettlementDetails146.mmStampDutyTaxBasis,
						com.tools20022.repository.msg.SettlementDetails146.mmTracking, com.tools20022.repository.msg.SettlementDetails146.mmLetterOfGuarantee, com.tools20022.repository.msg.SettlementDetails146.mmReturnLeg,
						com.tools20022.repository.msg.SettlementDetails146.mmModificationCancellationAllowed, com.tools20022.repository.msg.SettlementDetails146.mmEligibleForCollateral,
						com.tools20022.repository.msg.SettlementDetails146.mmSecuritiesSubBalanceType, com.tools20022.repository.msg.SettlementDetails146.mmCashSubBalanceType);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementDetailsElementsUsageRule.forSettlementDetails146,
						com.tools20022.repository.constraints.ConstraintCashSettlementSystemUsageRule.forSettlementDetails146, com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule.forSettlementDetails146);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDetails146";
				definition = "Details of settlement of a transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecuritiesTransactionType37Choice> getSecuritiesTransactionType() {
		return securitiesTransactionType == null ? Optional.empty() : Optional.of(securitiesTransactionType);
	}

	public SettlementDetails146 setSecuritiesTransactionType(SecuritiesTransactionType37Choice securitiesTransactionType) {
		this.securitiesTransactionType = securitiesTransactionType;
		return this;
	}

	public List<SettlementTransactionCondition16Choice> getSettlementTransactionCondition() {
		return settlementTransactionCondition == null ? settlementTransactionCondition = new ArrayList<>() : settlementTransactionCondition;
	}

	public SettlementDetails146 setSettlementTransactionCondition(List<SettlementTransactionCondition16Choice> settlementTransactionCondition) {
		this.settlementTransactionCondition = Objects.requireNonNull(settlementTransactionCondition);
		return this;
	}

	public Optional<BeneficialOwnership4Choice> getBeneficialOwnership() {
		return beneficialOwnership == null ? Optional.empty() : Optional.of(beneficialOwnership);
	}

	public SettlementDetails146 setBeneficialOwnership(BeneficialOwnership4Choice beneficialOwnership) {
		this.beneficialOwnership = beneficialOwnership;
		return this;
	}

	public Optional<CentralCounterPartyEligibility4Choice> getCCPEligibility() {
		return cCPEligibility == null ? Optional.empty() : Optional.of(cCPEligibility);
	}

	public SettlementDetails146 setCCPEligibility(CentralCounterPartyEligibility4Choice cCPEligibility) {
		this.cCPEligibility = cCPEligibility;
		return this;
	}

	public Optional<DeliveryReturn3Choice> getDeliveryReturnReason() {
		return deliveryReturnReason == null ? Optional.empty() : Optional.of(deliveryReturnReason);
	}

	public SettlementDetails146 setDeliveryReturnReason(DeliveryReturn3Choice deliveryReturnReason) {
		this.deliveryReturnReason = deliveryReturnReason;
		return this;
	}

	public Optional<CashSettlementSystem4Choice> getCashClearingSystem() {
		return cashClearingSystem == null ? Optional.empty() : Optional.of(cashClearingSystem);
	}

	public SettlementDetails146 setCashClearingSystem(CashSettlementSystem4Choice cashClearingSystem) {
		this.cashClearingSystem = cashClearingSystem;
		return this;
	}

	public Optional<ExposureType16Choice> getExposureType() {
		return exposureType == null ? Optional.empty() : Optional.of(exposureType);
	}

	public SettlementDetails146 setExposureType(ExposureType16Choice exposureType) {
		this.exposureType = exposureType;
		return this;
	}

	public Optional<FXStandingInstruction4Choice> getFXStandingInstruction() {
		return fXStandingInstruction == null ? Optional.empty() : Optional.of(fXStandingInstruction);
	}

	public SettlementDetails146 setFXStandingInstruction(FXStandingInstruction4Choice fXStandingInstruction) {
		this.fXStandingInstruction = fXStandingInstruction;
		return this;
	}

	public Optional<MarketClientSide6Choice> getMarketClientSide() {
		return marketClientSide == null ? Optional.empty() : Optional.of(marketClientSide);
	}

	public SettlementDetails146 setMarketClientSide(MarketClientSide6Choice marketClientSide) {
		this.marketClientSide = marketClientSide;
		return this;
	}

	public Optional<NettingEligibility4Choice> getNettingEligibility() {
		return nettingEligibility == null ? Optional.empty() : Optional.of(nettingEligibility);
	}

	public SettlementDetails146 setNettingEligibility(NettingEligibility4Choice nettingEligibility) {
		this.nettingEligibility = nettingEligibility;
		return this;
	}

	public Optional<Registration9Choice> getRegistration() {
		return registration == null ? Optional.empty() : Optional.of(registration);
	}

	public SettlementDetails146 setRegistration(Registration9Choice registration) {
		this.registration = registration;
		return this;
	}

	public Optional<Restriction5Choice> getLegalRestrictions() {
		return legalRestrictions == null ? Optional.empty() : Optional.of(legalRestrictions);
	}

	public SettlementDetails146 setLegalRestrictions(Restriction5Choice legalRestrictions) {
		this.legalRestrictions = legalRestrictions;
		return this;
	}

	public Optional<SettlingCapacity7Choice> getSettlingCapacity() {
		return settlingCapacity == null ? Optional.empty() : Optional.of(settlingCapacity);
	}

	public SettlementDetails146 setSettlingCapacity(SettlingCapacity7Choice settlingCapacity) {
		this.settlingCapacity = settlingCapacity;
		return this;
	}

	public Optional<TaxCapacityParty4Choice> getTaxCapacity() {
		return taxCapacity == null ? Optional.empty() : Optional.of(taxCapacity);
	}

	public SettlementDetails146 setTaxCapacity(TaxCapacityParty4Choice taxCapacity) {
		this.taxCapacity = taxCapacity;
		return this;
	}

	public Optional<GenericIdentification30> getStampDutyTaxBasis() {
		return stampDutyTaxBasis == null ? Optional.empty() : Optional.of(stampDutyTaxBasis);
	}

	public SettlementDetails146 setStampDutyTaxBasis(GenericIdentification30 stampDutyTaxBasis) {
		this.stampDutyTaxBasis = stampDutyTaxBasis;
		return this;
	}

	public Optional<Tracking4Choice> getTracking() {
		return tracking == null ? Optional.empty() : Optional.of(tracking);
	}

	public SettlementDetails146 setTracking(Tracking4Choice tracking) {
		this.tracking = tracking;
		return this;
	}

	public Optional<LetterOfGuarantee4Choice> getLetterOfGuarantee() {
		return letterOfGuarantee == null ? Optional.empty() : Optional.of(letterOfGuarantee);
	}

	public SettlementDetails146 setLetterOfGuarantee(LetterOfGuarantee4Choice letterOfGuarantee) {
		this.letterOfGuarantee = letterOfGuarantee;
		return this;
	}

	public Optional<YesNoIndicator> getReturnLeg() {
		return returnLeg == null ? Optional.empty() : Optional.of(returnLeg);
	}

	public SettlementDetails146 setReturnLeg(YesNoIndicator returnLeg) {
		this.returnLeg = returnLeg;
		return this;
	}

	public Optional<ModificationCancellationAllowed4Choice> getModificationCancellationAllowed() {
		return modificationCancellationAllowed == null ? Optional.empty() : Optional.of(modificationCancellationAllowed);
	}

	public SettlementDetails146 setModificationCancellationAllowed(ModificationCancellationAllowed4Choice modificationCancellationAllowed) {
		this.modificationCancellationAllowed = modificationCancellationAllowed;
		return this;
	}

	public Optional<YesNoIndicator> getEligibleForCollateral() {
		return eligibleForCollateral == null ? Optional.empty() : Optional.of(eligibleForCollateral);
	}

	public SettlementDetails146 setEligibleForCollateral(YesNoIndicator eligibleForCollateral) {
		this.eligibleForCollateral = eligibleForCollateral;
		return this;
	}

	public Optional<GenericIdentification30> getSecuritiesSubBalanceType() {
		return securitiesSubBalanceType == null ? Optional.empty() : Optional.of(securitiesSubBalanceType);
	}

	public SettlementDetails146 setSecuritiesSubBalanceType(GenericIdentification30 securitiesSubBalanceType) {
		this.securitiesSubBalanceType = securitiesSubBalanceType;
		return this;
	}

	public Optional<GenericIdentification30> getCashSubBalanceType() {
		return cashSubBalanceType == null ? Optional.empty() : Optional.of(cashSubBalanceType);
	}

	public SettlementDetails146 setCashSubBalanceType(GenericIdentification30 cashSubBalanceType) {
		this.cashSubBalanceType = cashSubBalanceType;
		return this;
	}
}