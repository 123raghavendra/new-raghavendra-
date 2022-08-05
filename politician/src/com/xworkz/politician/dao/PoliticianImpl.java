package com.xworkz.politician.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.politician.constant.PartyNameType;
import com.xworkz.politician.constant.PartySymbolType;
import com.xworkz.politician.constant.PresidentNames;
import com.xworkz.politician.dto.PoliticianDTO;

import static com.xworkz.politician.constant.MySqlProperties.*;

public class PoliticianImpl implements PoliticianDAO {

	@Override
	public boolean save(PoliticianDTO dto) {

		try (Connection connection = DriverManager.getConnection(URL.getName(), USERNAME.getName(), SECRET.getName())) {
			String insert = "insert into politician.politician_info values(?,?,?,?,?,?,?,?,?)";

			PreparedStatement preparedStatement = connection.prepareStatement(insert);

			preparedStatement.setInt(1, dto.getPid());
			preparedStatement.setString(2, dto.getName());
			preparedStatement.setString(3, dto.getPartyName().getName());
			preparedStatement.setString(4, dto.getPresident().getNames());
			preparedStatement.setInt(5, dto.getTotalMember());
			preparedStatement.setDouble(6, dto.getPartyBudject());
			preparedStatement.setInt(7, dto.getHeadQuaters());
			preparedStatement.setString(8, dto.getPartyLocation());
			preparedStatement.setString(9, dto.getPartySymbol().getType());
			int noOfRowsAffected = preparedStatement.executeUpdate();

			System.out.println(noOfRowsAffected);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public PoliticianDTO findBypid(int pid) {
		try (Connection connection = DriverManager.getConnection(URL.getName(), USERNAME.getName(), SECRET.getName())) {

			String select = "select * from politician.politician_info where pid=?";
			PreparedStatement preparedSatement = connection.prepareStatement(select);
			preparedSatement.setInt(1, pid);
			ResultSet resultSet = preparedSatement.executeQuery();
			System.out.println(resultSet);

			while (resultSet.next()) {
				Integer pid1 = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String president = resultSet.getString(4);
				Integer totalMember = resultSet.getInt(5);
				Double partyBudject = resultSet.getDouble(6);
				Integer headQuaters = resultSet.getInt(7);
				String partyLocation = resultSet.getString(8);
				String partySymbol = resultSet.getString(9);
				System.out.println(resultSet);

				PoliticianDTO politiciandto = new PoliticianDTO();
				politiciandto.setPid(pid1);
				politiciandto.setName(name);
				politiciandto.setPartyName(PartyNameType.getByName(partyName));
				politiciandto.setPresident(PresidentNames.getBynames(president));
				politiciandto.setTotalMember(totalMember);
				politiciandto.setPartyBudject(partyBudject);
				politiciandto.setHeadQuaters(headQuaters);
				politiciandto.setPartyLocation(partyLocation);
				politiciandto.setPartySymbol(PartySymbolType.getByType(partySymbol));
				return politiciandto;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public PoliticianDTO findByIdAndPresident(int pid, String president) {

		try (Connection connection = DriverManager.getConnection(URL.getName(), USERNAME.getName(), SECRET.getName())) {

			String select = "select * from politician.politician_info where pid=? and president=?";
			PreparedStatement preparedSatement = connection.prepareStatement(select);
			preparedSatement.setInt(1, pid);
			preparedSatement.setString(2, president);
			ResultSet resultSet = preparedSatement.executeQuery();

			while (resultSet.next()) {
				Integer pid1 = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String president1 = resultSet.getString(4);
				Integer totalMember = resultSet.getInt(5);
				Double partyBudject = resultSet.getDouble(6);
				Integer headQuaters = resultSet.getInt(7);
				String partyLocation = resultSet.getString(8);
				String partySymbol = resultSet.getString(9);
				System.out.println(resultSet);

				PoliticianDTO politiciandto = new PoliticianDTO();
				politiciandto.setPid(pid1);
				politiciandto.setName(name);
				politiciandto.setPartyName(PartyNameType.getByName(partyName));
				politiciandto.setPresident(PresidentNames.getBynames(president1));
				politiciandto.setTotalMember(totalMember);
				politiciandto.setPartyBudject(partyBudject);
				politiciandto.setHeadQuaters(headQuaters);
				politiciandto.setPartyLocation(partyLocation);
				politiciandto.setPartySymbol(PartySymbolType.getByType(partySymbol));
				return politiciandto;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public PoliticianDTO findBypidAndPresidentAndName(int pid, String name, String president) {
		try (Connection connection = DriverManager.getConnection(URL.getName(), USERNAME.getName(), SECRET.getName())) {

			String select = "select * from politician.politician_info where pid=? and name=? and president=?";
			PreparedStatement preparedSatement = connection.prepareStatement(select);
			preparedSatement.setInt(1, pid);
			preparedSatement.setString(2, name);
			preparedSatement.setString(3, president);
			ResultSet resultSet = preparedSatement.executeQuery();

			while (resultSet.next()) {
				Integer pid1 = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String president1 = resultSet.getString(4);
				Integer totalMember = resultSet.getInt(5);
				Double partyBudject = resultSet.getDouble(6);
				Integer headQuaters = resultSet.getInt(7);
				String partyLocation = resultSet.getString(8);
				String partySymbol = resultSet.getString(9);
				System.out.println(resultSet);

				PoliticianDTO politiciandto = new PoliticianDTO();
				politiciandto.setPid(pid1);
				politiciandto.setName(name1);
				politiciandto.setPartyName(PartyNameType.getByName(partyName));
				politiciandto.setPresident(PresidentNames.getBynames(president1));
				politiciandto.setTotalMember(totalMember);
				politiciandto.setPartyBudject(partyBudject);
				politiciandto.setHeadQuaters(headQuaters);
				politiciandto.setPartyLocation(partyLocation);
				politiciandto.setPartySymbol(PartySymbolType.getByType(partySymbol));

				return politiciandto;
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public PoliticianDTO findBypidName(String name, int pid) {
		try (Connection connection = DriverManager.getConnection(URL.getName(), USERNAME.getName(), SECRET.getName())) {

			String select = "select * from politician_info where pid=? and name=? ";
			PreparedStatement preparedSatement = connection.prepareStatement(select);
			preparedSatement.setInt(1, pid);
			preparedSatement.setString(2, name);

			ResultSet resultSet = preparedSatement.executeQuery();

			while (resultSet.next()) {
				Integer pid1 = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String president1 = resultSet.getString(4);
				Integer totalMember = resultSet.getInt(5);
				Double partyBudject = resultSet.getDouble(6);
				Integer headQuaters = resultSet.getInt(7);
				String partyLocation = resultSet.getString(8);
				String partySymbol = resultSet.getString(9);
				System.out.println(resultSet);

				PoliticianDTO politiciandto = new PoliticianDTO();
				politiciandto.setPid(pid1);
				politiciandto.setName(name1);
				politiciandto.setPartyName(PartyNameType.getByName(partyName));
				politiciandto.setPresident(PresidentNames.getBynames(president1));
				politiciandto.setTotalMember(totalMember);
				politiciandto.setPartyBudject(partyBudject);
				politiciandto.setHeadQuaters(headQuaters);
				politiciandto.setPartyLocation(partyLocation);
				politiciandto.setPartySymbol(PartySymbolType.getByType(partySymbol));

				return politiciandto;
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return null;

	}
}
