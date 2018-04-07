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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.secl.SettlementObligationReportV03;
import com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03;
import com.tools20022.repository.area.secl.TradeLegNotificationV03;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification30;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account to or from which a securities entry is made.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19#mmIdentification
 * SecuritiesAccount19.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount19#mmType
 * SecuritiesAccount19.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount19#mmName
 * SecuritiesAccount19.mmName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
 * SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03#mmDeliveryAccount
 * TradeLegNotificationV03.mmDeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03#mmDeliveryAccount
 * TradeLegNotificationCancellationV03.mmDeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.SettlementObligationReportV03#mmDeliveryAccount
 * SettlementObligationReportV03.mmDeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04#mmSafekeepingAccount
 * SecuritiesStatusOrStatementQueryStatusAdviceV04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04#mmSafekeepingAccount
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.
 * mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV07#mmSafekeepingAccount
 * SecuritiesSettlementConditionModificationStatusAdviceV07.mmSafekeepingAccount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV04#mmSafekeepingAccount
 * SecuritiesSettlementAllegementRemovalAdviceV04.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05#mmSafekeepingAccount
 * SecuritiesTransactionCancellationRequestV05.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV07#mmSafekeepingAccount
 * SecuritiesSettlementConditionsModificationRequestV07.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV07#mmSafekeepingAccount
 * IntraPositionMovementConfirmationV07.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementPostingReportV07#mmSafekeepingAccount
 * IntraPositionMovementPostingReportV07.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV09#mmSafekeepingAccount
 * SecuritiesTransactionPendingReportV09.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesSettlementTransactionAllegementReportV07#mmSafekeepingAccount
 * SecuritiesSettlementTransactionAllegementReportV07.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV05#mmSafekeepingAccount
 * PortfolioTransferNotificationV05.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV08#mmSafekeepingAccount
 * SecuritiesTransactionPostingReportV08.mmSafekeepingAccount}</li>
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
 * "SecuritiesAccount19"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a securities entry is made."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccount19", propOrder = {"identification", "type", "name"})
public class SecuritiesAccount19 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1, FIXSynonym: 660, ISO15022Synonym:
	 * :97a::SAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccount19, Max35Text> mmIdentification = new MMMessageAttribute<SecuritiesAccount19, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
			isDerived = false;
			xmlTag = "Id";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1"), new FIXSynonym(this, "660"), new ISO15022Synonym(this, ":97a::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesAccount19 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SecuritiesAccount19 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Tp")
	protected GenericIdentification30 type;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesAccountType
	 * SecuritiesAccount.mmSecuritiesAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 581, ISO15022Synonym: :97B:,
	 * ISO15022Synonym: :97B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of securities account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccount19, Optional<GenericIdentification30>> mmType = new MMMessageAttribute<SecuritiesAccount19, Optional<GenericIdentification30>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesAccount.mmSecuritiesAccountType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "581"), new ISO15022Synonym(this, ":97B:"), new ISO15022Synonym(this, ":97B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of securities account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification30.mmObject();
		}

		@Override
		public Optional<GenericIdentification30> getValue(SecuritiesAccount19 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(SecuritiesAccount19 obj, Optional<GenericIdentification30> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Nm")
	protected Max70Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccount19, Optional<Max70Text>> mmName = new MMMessageAttribute<SecuritiesAccount19, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Description of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(SecuritiesAccount19 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(SecuritiesAccount19 obj, Optional<Max70Text> value) {
			obj.setName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccount19.mmIdentification, com.tools20022.repository.msg.SecuritiesAccount19.mmType,
						com.tools20022.repository.msg.SecuritiesAccount19.mmName);
				messageBuildingBlock_lazy = () -> Arrays.asList(TradeLegNotificationV03.mmDeliveryAccount, TradeLegNotificationCancellationV03.mmDeliveryAccount, SettlementObligationReportV03.mmDeliveryAccount,
						SecuritiesStatusOrStatementQueryStatusAdviceV04.mmSafekeepingAccount, SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmSafekeepingAccount,
						SecuritiesSettlementConditionModificationStatusAdviceV07.mmSafekeepingAccount, SecuritiesSettlementAllegementRemovalAdviceV04.mmSafekeepingAccount, SecuritiesTransactionCancellationRequestV05.mmSafekeepingAccount,
						SecuritiesSettlementConditionsModificationRequestV07.mmSafekeepingAccount, IntraPositionMovementConfirmationV07.mmSafekeepingAccount, IntraPositionMovementPostingReportV07.mmSafekeepingAccount,
						SecuritiesTransactionPendingReportV09.mmSafekeepingAccount, SecuritiesSettlementTransactionAllegementReportV07.mmSafekeepingAccount, PortfolioTransferNotificationV05.mmSafekeepingAccount,
						SecuritiesTransactionPostingReportV08.mmSafekeepingAccount);
				trace_lazy = () -> SecuritiesAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAccount19";
				definition = "Account to or from which a securities entry is made.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public SecuritiesAccount19 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<GenericIdentification30> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public SecuritiesAccount19 setType(GenericIdentification30 type) {
		this.type = type;
		return this;
	}

	public Optional<Max70Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public SecuritiesAccount19 setName(Max70Text name) {
		this.name = name;
		return this;
	}
}