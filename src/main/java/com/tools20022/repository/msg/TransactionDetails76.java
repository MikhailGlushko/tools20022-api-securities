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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV05;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the details of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmAccountOwnerTransactionIdentification
 * TransactionDetails76.mmAccountOwnerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmAccountServicerTransactionIdentification
 * TransactionDetails76.mmAccountServicerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmMarketInfrastructureTransactionIdentification
 * TransactionDetails76.mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmProcessorTransactionIdentification
 * TransactionDetails76.mmProcessorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmOtherTransactionIdentification
 * TransactionDetails76.mmOtherTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmAccountOwner
 * TransactionDetails76.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmSafekeepingAccount
 * TransactionDetails76.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmTransactionDetails
 * TransactionDetails76.mmTransactionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV05#mmModifiedTransactionDetails
 * SecuritiesSettlementTransactionModificationRequestV05.
 * mmModifiedTransactionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionDetails76"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the details of the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransactionDetails76", propOrder = {"accountOwnerTransactionIdentification", "accountServicerTransactionIdentification", "marketInfrastructureTransactionIdentification", "processorTransactionIdentification",
		"otherTransactionIdentification", "accountOwner", "safekeepingAccount", "transactionDetails"})
public class TransactionDetails76 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SettlementTypeAndIdentification18 accountOwnerTransactionIdentification;
	/**
	 * Unambiguous identification of the transaction as known by the account
	 * owner (or the instructing party managing the account).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18
	 * SettlementTypeAndIdentification18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountOwnerTransactionIdentification
	 * Entry.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76
	 * TransactionDetails76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwnerTransactionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Entry.mmAccountOwnerTransactionIdentification;
			componentContext_lazy = () -> TransactionDetails76.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementTypeAndIdentification18.mmObject();
		}
	};
	protected Max35Text accountServicerTransactionIdentification;
	/**
	 * Unambiguous identification of the transaction as known by the account
	 * servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountServicerTransactionIdentification
	 * Entry.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76
	 * TransactionDetails76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicerTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Entry.mmAccountServicerTransactionIdentification;
			componentContext_lazy = () -> TransactionDetails76.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text marketInfrastructureTransactionIdentification;
	/**
	 * Identification of a transaction assigned by a market infrastructure other
	 * than a central securities depository, for example, Target2-Securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76
	 * TransactionDetails76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktInfrstrctrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructureTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketInfrastructureTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmMarketInfrastructureTransactionIdentification;
			componentContext_lazy = () -> TransactionDetails76.mmObject();
			isDerived = false;
			xmlTag = "MktInfrstrctrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text processorTransactionIdentification;
	/**
	 * Identification of the transaction assigned by the processor of the
	 * instruction other than the account owner the account servicer and the
	 * market infrastructure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmProcessorTransactionIdentification
	 * SecuritiesTradeIdentification.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76
	 * TransactionDetails76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessorTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the processor of the instruction other than the account owner the account servicer and the market infrastructure."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessorTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmProcessorTransactionIdentification;
			componentContext_lazy = () -> TransactionDetails76.mmObject();
			isDerived = false;
			xmlTag = "PrcrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessorTransactionIdentification";
			definition = "Identification of the transaction assigned by the processor of the instruction other than the account owner the account servicer and the market infrastructure.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text otherTransactionIdentification;
	/**
	 * Identification of a transaction that cannot be identified using a
	 * standard reference element present in the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76
	 * TransactionDetails76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a transaction that cannot be identified using a standard reference element present in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> TransactionDetails76.mmObject();
			isDerived = false;
			xmlTag = "OthrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherTransactionIdentification";
			definition = "Identification of a transaction that cannot be identified using a standard reference element present in the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification98 accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification98
	 * PartyIdentification98}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76
	 * TransactionDetails76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> TransactionDetails76.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification98.mmObject();
		}
	};
	protected SecuritiesAccount19 safekeepingAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesAccount
	 * Security.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76
	 * TransactionDetails76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesAccount;
			componentContext_lazy = () -> TransactionDetails76.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
		}
	};
	protected TransactionDetails74 transactionDetails;
	/**
	 * Provides additional details on the transaction which can not be included
	 * within the structured fields of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionDetails74
	 * TransactionDetails74}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76
	 * TransactionDetails76}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional details on the transaction which can not be included within the structured fields of the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTrade.mmObject();
			componentContext_lazy = () -> TransactionDetails76.mmObject();
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Provides additional details on the transaction which can not be included within the structured fields of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionDetails74.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransactionDetails76.mmAccountOwnerTransactionIdentification, TransactionDetails76.mmAccountServicerTransactionIdentification,
						TransactionDetails76.mmMarketInfrastructureTransactionIdentification, TransactionDetails76.mmProcessorTransactionIdentification, TransactionDetails76.mmOtherTransactionIdentification,
						TransactionDetails76.mmAccountOwner, TransactionDetails76.mmSafekeepingAccount, TransactionDetails76.mmTransactionDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestV05.mmModifiedTransactionDetails);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionDetails76";
				definition = "Identifies the details of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AcctOwnrTxId", required = true)
	public SettlementTypeAndIdentification18 getAccountOwnerTransactionIdentification() {
		return accountOwnerTransactionIdentification;
	}

	public void setAccountOwnerTransactionIdentification(com.tools20022.repository.msg.SettlementTypeAndIdentification18 accountOwnerTransactionIdentification) {
		this.accountOwnerTransactionIdentification = accountOwnerTransactionIdentification;
	}

	@XmlElement(name = "AcctSvcrTxId")
	public Max35Text getAccountServicerTransactionIdentification() {
		return accountServicerTransactionIdentification;
	}

	public void setAccountServicerTransactionIdentification(Max35Text accountServicerTransactionIdentification) {
		this.accountServicerTransactionIdentification = accountServicerTransactionIdentification;
	}

	@XmlElement(name = "MktInfrstrctrTxId")
	public Max35Text getMarketInfrastructureTransactionIdentification() {
		return marketInfrastructureTransactionIdentification;
	}

	public void setMarketInfrastructureTransactionIdentification(Max35Text marketInfrastructureTransactionIdentification) {
		this.marketInfrastructureTransactionIdentification = marketInfrastructureTransactionIdentification;
	}

	@XmlElement(name = "PrcrTxId")
	public Max35Text getProcessorTransactionIdentification() {
		return processorTransactionIdentification;
	}

	public void setProcessorTransactionIdentification(Max35Text processorTransactionIdentification) {
		this.processorTransactionIdentification = processorTransactionIdentification;
	}

	@XmlElement(name = "OthrTxId")
	public Max35Text getOtherTransactionIdentification() {
		return otherTransactionIdentification;
	}

	public void setOtherTransactionIdentification(Max35Text otherTransactionIdentification) {
		this.otherTransactionIdentification = otherTransactionIdentification;
	}

	@XmlElement(name = "AcctOwnr")
	public PartyIdentification98 getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(com.tools20022.repository.msg.PartyIdentification98 accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "SfkpgAcct", required = true)
	public SecuritiesAccount19 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(com.tools20022.repository.msg.SecuritiesAccount19 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}

	@XmlElement(name = "TxDtls")
	public TransactionDetails74 getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(com.tools20022.repository.msg.TransactionDetails74 transactionDetails) {
		this.transactionDetails = transactionDetails;
	}
}