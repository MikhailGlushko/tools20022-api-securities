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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementLatestVersion;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The AccountDetailsConfirmation message is sent by an account servicer, for
 * example, a registrar, transfer agent, custodian bank or securities depository
 * to the account owner, for example, an investor to confirm the opening of an
 * account, execution of an AccountModificationInstruction or to return
 * information requested in a GetAccountDetails message.<br>
 * <b>Usage</b><br>
 * The AccountDetailsConfirmation message is used to confirm the opening of an
 * account, modification of an account or the provision of information requested
 * in a previously sent GetAccountDetails message. The message contains detailed
 * information relevant to the opened account.<br>
 * When the AccountDetailsConfirmation is used to confirm execution of an
 * AccountModificationInstruction message, it may:<br>
 * - contain the modified subsets of account details that were specified in the
 * AccountModificationInstruction, and/or<br>
 * - provide the status of the account.<br>
 * When the AccountModificationInstruction message is used to instruct the
 * closure of an account, the AccountDetailsConfirmation message is used to
 * confirm the account has been closed. <br>
 * When the AccountDetailsConfirmation is used to reply to a GetAccountDetails
 * message, it returns the selected subsets of account details that were
 * specified in the GetAccountDetails message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmMessageIdentification
 * AccountDetailsConfirmationV07.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmOrderReference
 * AccountDetailsConfirmationV07.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmRelatedReference
 * AccountDetailsConfirmationV07.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmConfirmationDetails
 * AccountDetailsConfirmationV07.mmConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmInvestmentAccount
 * AccountDetailsConfirmationV07.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmAccountParties
 * AccountDetailsConfirmationV07.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmIntermediaries
 * AccountDetailsConfirmationV07.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmPlacement
 * AccountDetailsConfirmationV07.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmNewIssueAllocation
 * AccountDetailsConfirmationV07.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmSavingsInvestmentPlan
 * AccountDetailsConfirmationV07.mmSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmWithdrawalInvestmentPlan
 * AccountDetailsConfirmationV07.mmWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmCashSettlement
 * AccountDetailsConfirmationV07.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmServiceLevelAgreement
 * AccountDetailsConfirmationV07.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmAdditionalInformation
 * AccountDetailsConfirmationV07.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmMarketPracticeVersion
 * AccountDetailsConfirmationV07.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmExtension
 * AccountDetailsConfirmationV07.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctDtlsConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
 * AccountManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.002.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountRule#for_acmt_AccountDetailsConfirmationV07
 * ConstraintInvestmentAccountRule.for_acmt_AccountDetailsConfirmationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUnitRule#for_acmt_AccountDetailsConfirmationV07
 * ConstraintUnitRule.for_acmt_AccountDetailsConfirmationV07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountDetailsConfirmationV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AccountDetailsConfirmation message is sent by an account servicer, for example, a registrar, transfer agent, custodian bank or securities depository to the account owner, for example, an investor to confirm the opening of an account, execution of an AccountModificationInstruction or to return information requested in a GetAccountDetails message.\r\nUsage\r\nThe AccountDetailsConfirmation message is used to confirm the opening of an account, modification of an account or the provision of information requested in a previously sent GetAccountDetails message. The message contains detailed information relevant to the opened account.\r\nWhen the AccountDetailsConfirmation is used to confirm execution of an AccountModificationInstruction message, it may:\r\n- contain the modified subsets of account details that were specified in the AccountModificationInstruction, and/or\r\n- provide the status of the account.\r\nWhen the AccountModificationInstruction message is used to instruct the closure of an account, the AccountDetailsConfirmation message is used to confirm the account has been closed. \r\nWhen the AccountDetailsConfirmation is used to reply to a GetAccountDetails message, it returns the selected subsets of account details that were specified in the GetAccountDetails message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountDetailsConfirmationV07", propOrder = {"messageIdentification", "orderReference", "relatedReference", "confirmationDetails", "investmentAccount", "accountParties", "intermediaries", "placement", "newIssueAllocation",
		"savingsInvestmentPlan", "withdrawalInvestmentPlan", "cashSettlement", "serviceLevelAgreement", "additionalInformation", "marketPracticeVersion", "extension"})
public class AccountDetailsConfirmationV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies the message from a business application standpoint."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "OrdrRef")
	protected InvestmentFundOrder4 orderReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder4
	 * InvestmentFundOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a related order or settlement transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, Optional<InvestmentFundOrder4>> mmOrderReference = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, Optional<InvestmentFundOrder4>>() {
		{
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Identifies a related order or settlement transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundOrder4.mmObject();
		}

		@Override
		public Optional<InvestmentFundOrder4> getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, Optional<InvestmentFundOrder4> value) {
			obj.setOrderReference(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference6 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, Optional<AdditionalReference6>> mmRelatedReference = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, Optional<AdditionalReference6>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		@Override
		public Optional<AdditionalReference6> getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, Optional<AdditionalReference6> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "ConfDtls", required = true)
	protected AccountManagementConfirmation4 confirmationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation4
	 * AccountManagementConfirmation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the request or instruction which triggered this confirmation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, AccountManagementConfirmation4> mmConfirmationDetails = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, AccountManagementConfirmation4>() {
		{
			xmlTag = "ConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDetails";
			definition = "Information about the request or instruction which triggered this confirmation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountManagementConfirmation4.mmObject();
		}

		@Override
		public AccountManagementConfirmation4 getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getConfirmationDetails();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, AccountManagementConfirmation4 value) {
			obj.setConfirmationDetails(value);
		}
	};
	@XmlElement(name = "InvstmtAcct")
	protected InvestmentAccount62 investmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62
	 * InvestmentAccount62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to the investment account."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, Optional<InvestmentAccount62>> mmInvestmentAccount = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, Optional<InvestmentAccount62>>() {
		{
			xmlTag = "InvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Confirmation of the information related to the investment account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccount62.mmObject();
		}

		@Override
		public Optional<InvestmentAccount62> getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getInvestmentAccount();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, Optional<InvestmentAccount62> value) {
			obj.setInvestmentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctPties")
	protected AccountParties15 accountParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of information related to parties that are related to the account, for example, primary account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, Optional<AccountParties15>> mmAccountParties = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, Optional<AccountParties15>>() {
		{
			xmlTag = "AcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountParties";
			definition = "Confirmation of information related to parties that are related to the account, for example, primary account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountParties15.mmObject();
		}

		@Override
		public Optional<AccountParties15> getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getAccountParties();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, Optional<AccountParties15> value) {
			obj.setAccountParties(value.orElse(null));
		}
	};
	@XmlElement(name = "Intrmies")
	protected List<Intermediary36> intermediaries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary36
	 * Intermediary36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmies"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediaries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of an intermediary or other party related to the management of the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, List<Intermediary36>> mmIntermediaries = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, List<Intermediary36>>() {
		{
			xmlTag = "Intrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediaries";
			definition = "Confirmation of an intermediary or other party related to the management of the account.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> Intermediary36.mmObject();
		}

		@Override
		public List<Intermediary36> getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getIntermediaries();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, List<Intermediary36> value) {
			obj.setIntermediaries(value);
		}
	};
	@XmlElement(name = "Plcmnt")
	protected ReferredAgent2 placement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReferredAgent2
	 * ReferredAgent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Plcmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Confirmation of referral information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, Optional<ReferredAgent2>> mmPlacement = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, Optional<ReferredAgent2>>() {
		{
			xmlTag = "Plcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			definition = "Confirmation of referral information.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ReferredAgent2.mmObject();
		}

		@Override
		public Optional<ReferredAgent2> getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getPlacement();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, Optional<ReferredAgent2> value) {
			obj.setPlacement(value.orElse(null));
		}
	};
	@XmlElement(name = "NewIsseAllcn")
	protected NewIssueAllocation2 newIssueAllocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2
	 * NewIssueAllocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewIsseAllcn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssueAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, Optional<NewIssueAllocation2>> mmNewIssueAllocation = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, Optional<NewIssueAllocation2>>() {
		{
			xmlTag = "NewIsseAllcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssueAllocation";
			definition = "Confirmation of eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NewIssueAllocation2.mmObject();
		}

		@Override
		public Optional<NewIssueAllocation2> getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getNewIssueAllocation();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, Optional<NewIssueAllocation2> value) {
			obj.setNewIssueAllocation(value.orElse(null));
		}
	};
	@XmlElement(name = "SvgsInvstmtPlan")
	protected List<InvestmentPlan14> savingsInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvgsInvstmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SavingsInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to a savings plan that is related to the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, List<InvestmentPlan14>> mmSavingsInvestmentPlan = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, List<InvestmentPlan14>>() {
		{
			xmlTag = "SvgsInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsInvestmentPlan";
			definition = "Confirmation of the information related to a savings plan that is related to the account.";
			maxOccurs = 50;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan14.mmObject();
		}

		@Override
		public List<InvestmentPlan14> getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getSavingsInvestmentPlan();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, List<InvestmentPlan14> value) {
			obj.setSavingsInvestmentPlan(value);
		}
	};
	@XmlElement(name = "WdrwlInvstmtPlan")
	protected List<InvestmentPlan14> withdrawalInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WdrwlInvstmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to a withdrawal plan that is related to the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, List<InvestmentPlan14>> mmWithdrawalInvestmentPlan = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, List<InvestmentPlan14>>() {
		{
			xmlTag = "WdrwlInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalInvestmentPlan";
			definition = "Confirmation of the information related to a withdrawal plan that is related to the account.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan14.mmObject();
		}

		@Override
		public List<InvestmentPlan14> getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getWithdrawalInvestmentPlan();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, List<InvestmentPlan14> value) {
			obj.setWithdrawalInvestmentPlan(value);
		}
	};
	@XmlElement(name = "CshSttlm")
	protected List<CashSettlement1> cashSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashSettlement1
	 * CashSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of a cash settlement standing instruction associated to transactions on the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, List<CashSettlement1>> mmCashSettlement = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, List<CashSettlement1>>() {
		{
			xmlTag = "CshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "Confirmation of a cash settlement standing instruction associated to transactions on the account.";
			maxOccurs = 8;
			minOccurs = 0;
			complexType_lazy = () -> CashSettlement1.mmObject();
		}

		@Override
		public List<CashSettlement1> getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getCashSettlement();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, List<CashSettlement1> value) {
			obj.setCashSettlement(value);
		}
	};
	@XmlElement(name = "SvcLvlAgrmt")
	protected List<DocumentToSend3> serviceLevelAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.DocumentToSend3
	 * DocumentToSend3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcLvlAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevelAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies documents to be provided for the account opening."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, List<DocumentToSend3>> mmServiceLevelAgreement = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, List<DocumentToSend3>>() {
		{
			xmlTag = "SvcLvlAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelAgreement";
			definition = "Identifies documents to be provided for the account opening.";
			maxOccurs = 30;
			minOccurs = 0;
			complexType_lazy = () -> DocumentToSend3.mmObject();
		}

		@Override
		public List<DocumentToSend3> getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getServiceLevelAgreement();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, List<DocumentToSend3> value) {
			obj.setServiceLevelAgreement(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<AdditiononalInformation12> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12
	 * AdditiononalInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information such as remarks or notes that must be conveyed about the party and or limitations and restrictions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, List<AdditiononalInformation12>> mmAdditionalInformation = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, List<AdditiononalInformation12>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information such as remarks or notes that must be conveyed about the party and or limitations and restrictions.";
			minOccurs = 0;
			complexType_lazy = () -> AdditiononalInformation12.mmObject();
		}

		@Override
		public List<AdditiononalInformation12> getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, List<AdditiononalInformation12> value) {
			obj.setAdditionalInformation(value);
		}
	};
	@XmlElement(name = "MktPrctcVrsn")
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, Optional<MarketPracticeVersion1>> mmMarketPracticeVersion = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, Optional<MarketPracticeVersion1>>() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		@Override
		public Optional<MarketPracticeVersion1> getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getMarketPracticeVersion();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, Optional<MarketPracticeVersion1> value) {
			obj.setMarketPracticeVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountDetailsConfirmationV07, List<Extension1>> mmExtension = new MMMessageBuildingBlock<AccountDetailsConfirmationV07, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(AccountDetailsConfirmationV07 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(AccountDetailsConfirmationV07 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountRule.for_acmt_AccountDetailsConfirmationV07,
						com.tools20022.repository.constraints.ConstraintUnitRule.for_acmt_AccountDetailsConfirmationV07);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountDetailsConfirmationV07";
				definition = "Scope\r\nThe AccountDetailsConfirmation message is sent by an account servicer, for example, a registrar, transfer agent, custodian bank or securities depository to the account owner, for example, an investor to confirm the opening of an account, execution of an AccountModificationInstruction or to return information requested in a GetAccountDetails message.\r\nUsage\r\nThe AccountDetailsConfirmation message is used to confirm the opening of an account, modification of an account or the provision of information requested in a previously sent GetAccountDetails message. The message contains detailed information relevant to the opened account.\r\nWhen the AccountDetailsConfirmation is used to confirm execution of an AccountModificationInstruction message, it may:\r\n- contain the modified subsets of account details that were specified in the AccountModificationInstruction, and/or\r\n- provide the status of the account.\r\nWhen the AccountModificationInstruction message is used to instruct the closure of an account, the AccountDetailsConfirmation message is used to confirm the account has been closed. \r\nWhen the AccountDetailsConfirmation is used to reply to a GetAccountDetails message, it returns the selected subsets of account details that were specified in the GetAccountDetails message.";
				rootElement = "Document";
				xmlTag = "AcctDtlsConf";
				businessArea_lazy = () -> AccountManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmMessageIdentification, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmOrderReference,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmRelatedReference, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmConfirmationDetails,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmInvestmentAccount, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmAccountParties,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmIntermediaries, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmPlacement,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmNewIssueAllocation, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmSavingsInvestmentPlan,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmWithdrawalInvestmentPlan, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmCashSettlement,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmServiceLevelAgreement, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmAdditionalInformation,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmMarketPracticeVersion, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "002";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountDetailsConfirmationV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountDetailsConfirmationV07 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<InvestmentFundOrder4> getOrderReference() {
		return orderReference == null ? Optional.empty() : Optional.of(orderReference);
	}

	public AccountDetailsConfirmationV07 setOrderReference(InvestmentFundOrder4 orderReference) {
		this.orderReference = orderReference;
		return this;
	}

	public Optional<AdditionalReference6> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public AccountDetailsConfirmationV07 setRelatedReference(AdditionalReference6 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public AccountManagementConfirmation4 getConfirmationDetails() {
		return confirmationDetails;
	}

	public AccountDetailsConfirmationV07 setConfirmationDetails(AccountManagementConfirmation4 confirmationDetails) {
		this.confirmationDetails = Objects.requireNonNull(confirmationDetails);
		return this;
	}

	public Optional<InvestmentAccount62> getInvestmentAccount() {
		return investmentAccount == null ? Optional.empty() : Optional.of(investmentAccount);
	}

	public AccountDetailsConfirmationV07 setInvestmentAccount(InvestmentAccount62 investmentAccount) {
		this.investmentAccount = investmentAccount;
		return this;
	}

	public Optional<AccountParties15> getAccountParties() {
		return accountParties == null ? Optional.empty() : Optional.of(accountParties);
	}

	public AccountDetailsConfirmationV07 setAccountParties(AccountParties15 accountParties) {
		this.accountParties = accountParties;
		return this;
	}

	public List<Intermediary36> getIntermediaries() {
		return intermediaries == null ? intermediaries = new ArrayList<>() : intermediaries;
	}

	public AccountDetailsConfirmationV07 setIntermediaries(List<Intermediary36> intermediaries) {
		this.intermediaries = Objects.requireNonNull(intermediaries);
		return this;
	}

	public Optional<ReferredAgent2> getPlacement() {
		return placement == null ? Optional.empty() : Optional.of(placement);
	}

	public AccountDetailsConfirmationV07 setPlacement(ReferredAgent2 placement) {
		this.placement = placement;
		return this;
	}

	public Optional<NewIssueAllocation2> getNewIssueAllocation() {
		return newIssueAllocation == null ? Optional.empty() : Optional.of(newIssueAllocation);
	}

	public AccountDetailsConfirmationV07 setNewIssueAllocation(NewIssueAllocation2 newIssueAllocation) {
		this.newIssueAllocation = newIssueAllocation;
		return this;
	}

	public List<InvestmentPlan14> getSavingsInvestmentPlan() {
		return savingsInvestmentPlan == null ? savingsInvestmentPlan = new ArrayList<>() : savingsInvestmentPlan;
	}

	public AccountDetailsConfirmationV07 setSavingsInvestmentPlan(List<InvestmentPlan14> savingsInvestmentPlan) {
		this.savingsInvestmentPlan = Objects.requireNonNull(savingsInvestmentPlan);
		return this;
	}

	public List<InvestmentPlan14> getWithdrawalInvestmentPlan() {
		return withdrawalInvestmentPlan == null ? withdrawalInvestmentPlan = new ArrayList<>() : withdrawalInvestmentPlan;
	}

	public AccountDetailsConfirmationV07 setWithdrawalInvestmentPlan(List<InvestmentPlan14> withdrawalInvestmentPlan) {
		this.withdrawalInvestmentPlan = Objects.requireNonNull(withdrawalInvestmentPlan);
		return this;
	}

	public List<CashSettlement1> getCashSettlement() {
		return cashSettlement == null ? cashSettlement = new ArrayList<>() : cashSettlement;
	}

	public AccountDetailsConfirmationV07 setCashSettlement(List<CashSettlement1> cashSettlement) {
		this.cashSettlement = Objects.requireNonNull(cashSettlement);
		return this;
	}

	public List<DocumentToSend3> getServiceLevelAgreement() {
		return serviceLevelAgreement == null ? serviceLevelAgreement = new ArrayList<>() : serviceLevelAgreement;
	}

	public AccountDetailsConfirmationV07 setServiceLevelAgreement(List<DocumentToSend3> serviceLevelAgreement) {
		this.serviceLevelAgreement = Objects.requireNonNull(serviceLevelAgreement);
		return this;
	}

	public List<AdditiononalInformation12> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public AccountDetailsConfirmationV07 setAdditionalInformation(List<AdditiononalInformation12> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return marketPracticeVersion == null ? Optional.empty() : Optional.of(marketPracticeVersion);
	}

	public AccountDetailsConfirmationV07 setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public AccountDetailsConfirmationV07 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.002.001.07")
	static public class Document {
		@XmlElement(name = "AcctDtlsConf", required = true)
		public AccountDetailsConfirmationV07 messageBody;
	}
}