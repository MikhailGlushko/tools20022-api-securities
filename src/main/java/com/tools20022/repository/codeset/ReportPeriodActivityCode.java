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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ReportPeriodActivityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of report activity for a specific period.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportPeriodActivityCode#NoTransaction
 * ReportPeriodActivityCode.NoTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportPeriodActivityCode#NoReportFromAgent
 * ReportPeriodActivityCode.NoReportFromAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportPeriodActivityCode#CorruptedReport
 * ReportPeriodActivityCode.CorruptedReport}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ReportPeriodActivity3Code
 * ReportPeriodActivity3Code}</li>
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
 * "ReportPeriodActivityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of report activity for a specific period."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReportPeriodActivityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * No transaction has been identified during the period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportPeriodActivityCode
	 * ReportPeriodActivityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No transaction has been identified during the period."</li>
	 * </ul>
	 */
	public static final ReportPeriodActivityCode NoTransaction = new ReportPeriodActivityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoTransaction";
			definition = "No transaction has been identified during the period.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportPeriodActivityCode.mmObject();
			codeName = "NOTX";
		}
	};
	/**
	 * No report has been received from reporting agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportPeriodActivityCode
	 * ReportPeriodActivityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NORA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoReportFromAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No report has been received from reporting agent."</li>
	 * </ul>
	 */
	public static final ReportPeriodActivityCode NoReportFromAgent = new ReportPeriodActivityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoReportFromAgent";
			definition = "No report has been received from reporting agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportPeriodActivityCode.mmObject();
			codeName = "NORA";
		}
	};
	/**
	 * Report has been received but was corrupted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportPeriodActivityCode
	 * ReportPeriodActivityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorruptedReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report has been received but was corrupted."</li>
	 * </ul>
	 */
	public static final ReportPeriodActivityCode CorruptedReport = new ReportPeriodActivityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorruptedReport";
			definition = "Report has been received but was corrupted.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportPeriodActivityCode.mmObject();
			codeName = "CRPT";
		}
	};
	final static private LinkedHashMap<String, ReportPeriodActivityCode> codesByName = new LinkedHashMap<>();

	protected ReportPeriodActivityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportPeriodActivityCode";
				definition = "Specifies the type of report activity for a specific period.";
				derivation_lazy = () -> Arrays.asList(ReportPeriodActivity3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReportPeriodActivityCode.NoTransaction, com.tools20022.repository.codeset.ReportPeriodActivityCode.NoReportFromAgent,
						com.tools20022.repository.codeset.ReportPeriodActivityCode.CorruptedReport);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NoTransaction.getCodeName().get(), NoTransaction);
		codesByName.put(NoReportFromAgent.getCodeName().get(), NoReportFromAgent);
		codesByName.put(CorruptedReport.getCodeName().get(), CorruptedReport);
	}

	public static ReportPeriodActivityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReportPeriodActivityCode[] values() {
		ReportPeriodActivityCode[] values = new ReportPeriodActivityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReportPeriodActivityCode> {
		@Override
		public ReportPeriodActivityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReportPeriodActivityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}