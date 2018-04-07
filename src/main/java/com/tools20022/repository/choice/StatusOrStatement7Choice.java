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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DocumentNumber12;
import com.tools20022.repository.msg.DocumentNumber13;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the status or statement that is requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement7Choice#mmStatusAdvice
 * StatusOrStatement7Choice.mmStatusAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatusOrStatement7Choice#mmStatement
 * StatusOrStatement7Choice.mmStatement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV04#mmStatusOrStatementRequested
 * SecuritiesStatusOrStatementQueryStatusAdviceV04.mmStatusOrStatementRequested}
 * </li>
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
 * "StatusOrStatement7Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status or statement that is requested."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatusOrStatement7Choice", propOrder = {"statusAdvice", "statement"})
public class StatusOrStatement7Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StsAdvc", required = true)
	protected DocumentNumber12 statusAdvice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DocumentNumber12
	 * DocumentNumber12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.StatusOrStatement7Choice
	 * StatusOrStatement7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsAdvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identify the status advice and the transaction for which the status advice was requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusOrStatement7Choice, DocumentNumber12> mmStatusAdvice = new MMMessageAssociationEnd<StatusOrStatement7Choice, DocumentNumber12>() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.StatusOrStatement7Choice.mmObject();
			isDerived = false;
			xmlTag = "StsAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusAdvice";
			definition = "Identify the status advice and the transaction for which the status advice was requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentNumber12.mmObject();
		}

		@Override
		public DocumentNumber12 getValue(StatusOrStatement7Choice obj) {
			return obj.getStatusAdvice();
		}

		@Override
		public void setValue(StatusOrStatement7Choice obj, DocumentNumber12 value) {
			obj.setStatusAdvice(value);
		}
	};
	@XmlElement(name = "Stmt", required = true)
	protected DocumentNumber13 statement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DocumentNumber13
	 * DocumentNumber13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.StatusOrStatement7Choice
	 * StatusOrStatement7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Stmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Statement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identify the statement/report that was requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusOrStatement7Choice, DocumentNumber13> mmStatement = new MMMessageAssociationEnd<StatusOrStatement7Choice, DocumentNumber13>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.StatusOrStatement7Choice.mmObject();
			isDerived = false;
			xmlTag = "Stmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Statement";
			definition = "Identify the statement/report that was requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentNumber13.mmObject();
		}

		@Override
		public DocumentNumber13 getValue(StatusOrStatement7Choice obj) {
			return obj.getStatement();
		}

		@Override
		public void setValue(StatusOrStatement7Choice obj, DocumentNumber13 value) {
			obj.setStatement(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.StatusOrStatement7Choice.mmStatusAdvice, com.tools20022.repository.choice.StatusOrStatement7Choice.mmStatement);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesStatusOrStatementQueryStatusAdviceV04.mmStatusOrStatementRequested);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusOrStatement7Choice";
				definition = "Specifies the status or statement that is requested.";
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentNumber12 getStatusAdvice() {
		return statusAdvice;
	}

	public StatusOrStatement7Choice setStatusAdvice(DocumentNumber12 statusAdvice) {
		this.statusAdvice = Objects.requireNonNull(statusAdvice);
		return this;
	}

	public DocumentNumber13 getStatement() {
		return statement;
	}

	public StatusOrStatement7Choice setStatement(DocumentNumber13 statement) {
		this.statement = Objects.requireNonNull(statement);
		return this;
	}
}